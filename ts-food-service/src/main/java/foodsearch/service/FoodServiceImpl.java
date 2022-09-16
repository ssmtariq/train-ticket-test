package foodsearch.service;

import edu.fudan.common.util.Response;
import foodsearch.entity.*;
import foodsearch.repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Objects;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FoodOrderRepository foodOrderRepository;


    String success = "Success.";
    String orderIdNotExist = "Order Id Is Non-Existent.";

    @Override
    public Response createFoodOrder(FoodOrder addFoodOrder, HttpHeaders headers) {

        FoodOrder fo = foodOrderRepository.findByOrderId(addFoodOrder.getOrderId());
        if (fo != null) {
            return new Response<>(0, "Order Id Has Existed.", null);
        } else {
            fo = new FoodOrder();
            fo.setId(UUID.randomUUID());
            fo.setOrderId(addFoodOrder.getOrderId());
            fo.setFoodType(addFoodOrder.getFoodType());
            if (addFoodOrder.getFoodType() == 2) {
                fo.setStationName(addFoodOrder.getStationName());
                fo.setStoreName(addFoodOrder.getStoreName());
            }
            fo.setFoodName(addFoodOrder.getFoodName());
            fo.setPrice(addFoodOrder.getPrice());
            foodOrderRepository.save(fo);
            return new Response<>(1, success, fo);
        }
    }

    @Override
    public Response deleteFoodOrder(String orderId, HttpHeaders headers) {
        FoodOrder foodOrder = foodOrderRepository.findByOrderId(UUID.fromString(orderId));
        if (foodOrder == null) {
            return new Response<>(0, orderIdNotExist, null);
        } else {
            foodOrderRepository.deleteFoodOrderByOrderId(UUID.fromString(orderId));
            return new Response<>(1, success, null);
        }
    }

    @Override
    public Response findAllFoodOrder(HttpHeaders headers) {
        List<FoodOrder> foodOrders = foodOrderRepository.findAll();
        if (foodOrders != null && !foodOrders.isEmpty()) {
            return new Response<>(1, success, foodOrders);
        } else {
            return new Response<>(0, "No Content", null);
        }
    }


    @Override
    public Response updateFoodOrder(FoodOrder updateFoodOrder, HttpHeaders headers) {
        FoodOrder fo = foodOrderRepository.findById(updateFoodOrder.getId());
        if (fo == null) {
            return new Response<>(0, orderIdNotExist, null);
        } else {
            fo.setFoodType(updateFoodOrder.getFoodType());
            if (updateFoodOrder.getFoodType() == 1) {
                fo.setStationName(updateFoodOrder.getStationName());
                fo.setStoreName(updateFoodOrder.getStoreName());
            }
            fo.setFoodName(updateFoodOrder.getFoodName());
            fo.setPrice(updateFoodOrder.getPrice());
            foodOrderRepository.save(fo);
            return new Response<>(1, "Success", fo);
        }
    }

    @Override
    public Response findByOrderId(String orderId, HttpHeaders headers) {
        FoodOrder fo = foodOrderRepository.findByOrderId(UUID.fromString(orderId));
        if (fo != null) {
            return new Response<>(1, success, fo);
        } else {
            return new Response<>(0, orderIdNotExist, null);
        }
    }


    @Override
    public Response getAllFood(String date, String startStation, String endStation, String tripId, HttpHeaders headers) {
        AllTripFood allTripFood = new AllTripFood();

        if (null == tripId || tripId.length() <= 2) {
            return new Response<>(0, "Trip id is not suitable", null);
        }

        // need return this tow element
        Map<String, List<FoodStore>> foodStoreListMap = new HashMap<>();

        /**--------------------------------------------------------------------------------------*/
        HttpEntity requestEntityGetTrainFoodListResult = new HttpEntity(headers);
        ResponseEntity<Response<List<TrainFood>>> reGetTrainFoodListResult = restTemplate.exchange(
                "http://ts-food-map-service:18855/api/v1/foodmapservice/trainfoods/" + tripId,
                HttpMethod.GET,
                requestEntityGetTrainFoodListResult,
                new ParameterizedTypeReference<Response<List<TrainFood>>>() {
                });

        List<TrainFood> trainFoodList = reGetTrainFoodListResult.getBody().getData();

        if (Objects.isNull(trainFoodList)) {
            return new Response<>(0, "Get the Get Food Request Failed!", null);
        }
        //车次途经的车站
        /**--------------------------------------------------------------------------------------*/
        HttpEntity requestEntityGetRouteResult = new HttpEntity(null, headers);
        ResponseEntity<Response<List<String>>> responseEntityStations = restTemplate.exchange(
                "http://ts-travel-service:12346/api/v1/travelservice/routes/" + tripId + "/stations",
                HttpMethod.GET,
                requestEntityGetRouteResult,
                new ParameterizedTypeReference<Response<List<String>>>() {
                });
        Response<List<String>> stationResult = responseEntityStations.getBody();

        if (stationResult.getStatus() == 1) {
            List<String> stations = stationResult.getData();
            //去除不经过的站，如果起点终点有的话
            List<String> stationNameList = new ArrayList<>();
            if(Objects.nonNull(startStation) && !startStation.isEmpty()){
                stationNameList.add(startStation);
            }
            if(Objects.nonNull(endStation) && !endStation.isEmpty()){
                stationNameList.add(endStation);
            }
            List<String> stationIDList = getStationIdsByName(stationNameList, headers);

            if(stationIDList.size()>1){
                for (int i = 0; i < stations.size(); i++) {
                    if (stations.get(i).equals(stationIDList.get(0))) {
                        break;
                    } else {
                        stations.remove(i);
                    }
                }

                for (int i = stations.size() - 1; i >= 0; i--) {
                    if (stations.get(i).equals(stationIDList.get(1))) {
                        break;
                    } else {
                        stations.remove(i);
                    }
                }
            }

            HttpEntity requestEntityFoodStoresListResult = new HttpEntity(stations, headers);
            ResponseEntity<Response<List<FoodStore>>> reFoodStoresListResult = restTemplate.exchange(
                    "http://ts-food-map-service:18855/api/v1/foodmapservice/foodstores",
                    HttpMethod.POST,
                    requestEntityFoodStoresListResult,
                    new ParameterizedTypeReference<Response<List<FoodStore>>>() {
                    });
            List<FoodStore> foodStoresListResult = reFoodStoresListResult.getBody().getData();
            if (foodStoresListResult != null && !foodStoresListResult.isEmpty()) {
                for (String stationId : stations) {
                    List<FoodStore> res = foodStoresListResult.stream()
                            .filter(foodStore -> (foodStore.getStationId().equals(stationId)))
                            .collect(Collectors.toList());
                    foodStoreListMap.put(stationId, res);
                }
            } else {
                return new Response<>(0, "Get All Food Failed", allTripFood);
            }
        } else {
            return new Response<>(0, "Get All Food Failed", allTripFood);
        }
        allTripFood.setTrainFoodList(trainFoodList);
        allTripFood.setFoodStoreListMap(foodStoreListMap);
        return new Response<>(1, "Get All Food Success", allTripFood);
    }

    private List<String> getStationIdsByName(List<String> stationNameList, HttpHeaders headers) {
        HttpEntity requestEntity = new HttpEntity(stationNameList, headers);
        ResponseEntity<Response<List<String>>> reEndStationId = restTemplate.exchange(
                "http://ts-station-service:12345/api/v1/stationservice/stations/idlist",
                HttpMethod.POST,
                requestEntity,
                new ParameterizedTypeReference<Response<List<String>>>() {
                });
        return reEndStationId.getBody().getData();
    }
}
