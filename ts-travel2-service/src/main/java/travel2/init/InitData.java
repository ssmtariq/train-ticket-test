package travel2.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import travel2.entity.TravelInfo;
import travel2.service.Travel2Service;
import java.util.Date;

/**
 * @author fdse
 */
@Component
public class InitData implements CommandLineRunner {

    @Autowired
    Travel2Service service;

    String zhiDa = "ZhiDa";
    String shanghai = "shanghai";
    String nanjing = "nanjing";
    String beijing = "beijing";

    @Override
    public void run(String... args)throws Exception{
        TravelInfo info = new TravelInfo();

        info.setTripId("Z1234");
        info.setTrainTypeId(zhiDa);
        info.setRouteId("0b23bd3e-876a-4af3-b920-c50a90c90b04");
        info.setStartingStationId(shanghai);
        info.setStationsId(nanjing);
        info.setTerminalStationId(beijing);
        info.setStartingTime(new Date("Mon May 04 09:51:52 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 15:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("Z1235");
        info.setTrainTypeId(zhiDa);
        info.setRouteId("9fc9c261-3263-4bfa-82f8-bb44e06b2f52");
        info.setStartingStationId(shanghai);
        info.setStationsId(nanjing);
        info.setTerminalStationId(beijing);
        info.setStartingTime(new Date("Mon May 04 11:31:52 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 17:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("Z1236");
        info.setTrainTypeId(zhiDa);
        info.setRouteId("d693a2c5-ef87-4a3c-bef8-600b43f62c68");
        info.setStartingStationId(shanghai);
        info.setStationsId(nanjing);
        info.setTerminalStationId(beijing);
        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("T1235");
        info.setTrainTypeId("TeKuai");
        info.setRouteId("20eb7122-3a11-423f-b10a-be0dc5bce7db");
        info.setStartingStationId(shanghai);
        info.setStationsId(nanjing);
        info.setTerminalStationId(beijing);
        info.setStartingTime(new Date("Mon May 04 08:31:52 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 17:21:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("K1345");
        info.setTrainTypeId("KuaiSu");
        info.setRouteId("1367db1f-461e-4ab7-87ad-2bcc05fd9cb7");
        info.setStartingStationId(shanghai);
        info.setStationsId(nanjing);
        info.setTerminalStationId(beijing);
        info.setStartingTime(new Date("Mon May 04 07:51:52 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 19:59:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        /*Add new Normal Trip*/

        info.setTripId("Z1237");
        info.setTrainTypeId(zhiDa);
        info.setRouteId("26e335c6-1efa-468e-a404-6f813248798b");
        info.setStartingStationId(shanghai);
        info.setStationsId(nanjing);
        info.setTerminalStationId(beijing);
        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

//        info.setTripId("Z1238");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("7b8c0886-1dc9-42a7-b1c0-ae351cd8e683");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);

//        info.setTripId("Z1239");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("88b74fde-db80-477c-9bee-2ef3d8fe5b19");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);

//        info.setTripId("Z1240");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("6ba359a7-4de2-4810-9bc8-28a94a3c3848");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);

//        info.setTripId("Z1241");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("39bfb3b3-9369-40c4-9c93-b5b6ee5dd76d");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);
//
//        info.setTripId("Z1242");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("ebfea9d2-b1e8-40e8-a8d1-f20b4897e4f4");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);

//        info.setTripId("Z1243");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("4813b2da-cb02-4824-bf05-3cfcdee1da61");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);
//
//        info.setTripId("Z1244");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("ba43ab68-978c-4d51-b3fb-26766d909c7b");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);
//
//        info.setTripId("Z1245");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("a11f1e49-f24a-4db1-9eff-a47cc2a9afc4");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);
//
//        info.setTripId("Z1246");
//        info.setTrainTypeId(zhiDa);
//        info.setRouteId("89de9a9b-5108-48c1-a564-b02833ebfe39");
//        info.setStartingStationId(shanghai);
//        info.setStationsId(nanjing);
//        info.setTerminalStationId(beijing);
//        info.setStartingTime(new Date("Mon May 04 7:05:52 GMT+0800 2013")); //NOSONAR
//        info.setEndTime(new Date("Mon May 04 12:51:52 GMT+0800 2013")); //NOSONAR
//        service.create(info,null);
    }
}
