package route.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import route.entity.RouteInfo;
import route.service.RouteService;

/**
 * @author fdse
 */
@Component
public class InitData implements CommandLineRunner {

    @Autowired
    RouteService routeService;

    String shanghai = "shanghai";
    String taiyuan = "taiyuan";
    String nanjing = "nanjing";

    @Override
    public void run(String... args)throws Exception{
        RouteInfo info = new RouteInfo();
        info.setId("0b23bd3e-876a-4af3-b920-c50a90c90b04");
        info.setStartStation(shanghai);
        info.setEndStation(taiyuan);
        info.setStationList("shanghai,nanjing,shijiazhuang,taiyuan");
        info.setDistanceList("0,350,1000,1300");
        routeService.createAndModify(info,null);

        info.setId("9fc9c261-3263-4bfa-82f8-bb44e06b2f52");
        info.setStartStation(nanjing);
        info.setEndStation("beijing");
        info.setStationList("nanjing,xuzhou,jinan,beijing");
        info.setDistanceList("0,500,700,1200");
        routeService.createAndModify(info,null);

        info.setId("d693a2c5-ef87-4a3c-bef8-600b43f62c68");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);


        info.setId("20eb7122-3a11-423f-b10a-be0dc5bce7db");
        info.setStartStation(shanghai);
        info.setEndStation(taiyuan);
        info.setStationList("shanghai,taiyuan");
        info.setDistanceList("0,1300");
        routeService.createAndModify(info,null);

        info.setId("1367db1f-461e-4ab7-87ad-2bcc05fd9cb7");
        info.setStartStation("shanghaihongqiao");
        info.setEndStation("hangzhou");
        info.setStationList("shanghaihongqiao,jiaxingnan,hangzhou");
        info.setDistanceList("0,150,300");
        routeService.createAndModify(info,null);

        info.setId("92708982-77af-4318-be25-57ccb0ff69ad");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,zhenjiang,wuxi,suzhou,shanghai");
        info.setDistanceList("0,100,150,200,250");
        routeService.createAndModify(info,null);

        info.setId("aefcef3f-3f42-46e8-afd7-6cb2a928bd3d");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,shanghai");
        info.setDistanceList("0,250");
        routeService.createAndModify(info,null);

        info.setId("a3f256c1-0e43-4f7d-9c21-121bf258101f");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("084837bb-53c8-4438-87c8-0321a4d09917");
        info.setStartStation("suzhou");
        info.setEndStation(shanghai);
        info.setStationList("suzhou,shanghai");
        info.setDistanceList("0,50");
        routeService.createAndModify(info,null);

        info.setId("f3d4d4ef-693b-4456-8eed-59c0d717dd08");
        info.setStartStation(shanghai);
        info.setEndStation("suzhou");
        info.setStationList("shanghai,suzhou");
        info.setDistanceList("0,50");
        routeService.createAndModify(info,null);
        
        /*Adding new highspeed train route*/

        info.setId("314db8ba-06fb-4a6a-aadb-70f3dc88a745");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("6f91eee5-47c3-4796-b593-4914ef104eea");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("9201643b-7e5c-4775-bd3c-a1cc8a06887d");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("80e1b43d-1826-4435-a3ab-ade07ced880c");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("d5127cd7-67db-4415-9651-73fd27025a7b");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("7e4e6fc8-5a62-407c-981b-22ee6636e472");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("8a80284f-cbc4-467e-809f-7a857a6875f2");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("85cd1d9b-0e47-4013-ad5b-a936f1bb2158");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("079527ba-40ab-49a1-a81f-5fd9136d676d");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        info.setId("a98dad5e-7ae7-4969-b2e1-142884f1c345");
        info.setStartStation(nanjing);
        info.setEndStation(shanghai);
        info.setStationList("nanjing,suzhou,shanghai");
        info.setDistanceList("0,200,250");
        routeService.createAndModify(info,null);

        /*Adding new normal train route*/
        info.setId("26e335c6-1efa-468e-a404-6f813248798b");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("7b8c0886-1dc9-42a7-b1c0-ae351cd8e683");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("88b74fde-db80-477c-9bee-2ef3d8fe5b19");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("6ba359a7-4de2-4810-9bc8-28a94a3c3848");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("39bfb3b3-9369-40c4-9c93-b5b6ee5dd76d");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("ebfea9d2-b1e8-40e8-a8d1-f20b4897e4f4");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("4813b2da-cb02-4824-bf05-3cfcdee1da61");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("ba43ab68-978c-4d51-b3fb-26766d909c7b");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("a11f1e49-f24a-4db1-9eff-a47cc2a9afc4");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

        info.setId("89de9a9b-5108-48c1-a564-b02833ebfe39");
        info.setStartStation(taiyuan);
        info.setEndStation(shanghai);
        info.setStationList("taiyuan,shijiazhuang,nanjing,shanghai");
        info.setDistanceList("0,300,950,1300");
        routeService.createAndModify(info,null);

    }

}
