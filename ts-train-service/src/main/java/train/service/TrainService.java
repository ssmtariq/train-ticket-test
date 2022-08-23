package train.service;

import org.springframework.http.HttpHeaders;
import train.entity.TrainType;

import java.util.List;
import java.util.Optional;

public interface TrainService {
    //CRUD
    boolean create(TrainType trainType, HttpHeaders headers);

    Optional<TrainType> retrieve(String id, HttpHeaders headers);

    Integer retrieveAverageSpeed(String id, HttpHeaders headers);

    boolean update(TrainType trainType,HttpHeaders headers);

    boolean delete(String id,HttpHeaders headers);

    List<TrainType> query(HttpHeaders headers);
}
