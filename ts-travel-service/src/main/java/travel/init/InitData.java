package travel.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import travel.entity.TravelInfo;
import travel.service.TravelService;

import java.util.Date;

/**
 * @author fdse
 */
@Component
public class InitData implements CommandLineRunner{

    @Autowired
    TravelService service;

    String gaoTieOne = "GaoTieOne";
    String shanghai = "shanghai";
    String suzhou = "suzhou";
    String taiyuan = "taiyuan";

    @Override
    public void run(String... args)throws Exception{
        TravelInfo info = new TravelInfo();

        info.setTripId("G1234");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("92708982-77af-4318-be25-57ccb0ff69ad");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 09:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 15:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1235");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("aefcef3f-3f42-46e8-afd7-6cb2a928bd3d");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 12:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 17:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1236");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("a3f256c1-0e43-4f7d-9c21-121bf258101f");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1237");
        info.setTrainTypeId("GaoTieTwo");
        info.setRouteId("084837bb-53c8-4438-87c8-0321a4d09917");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 08:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 17:21:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("D1345");
        info.setTrainTypeId("DongCheOne");
        info.setRouteId("f3d4d4ef-693b-4456-8eed-59c0d717dd08");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 07:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 19:59:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        /*Add new Highspeed Trip*/
        info.setTripId("G1238");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("314db8ba-06fb-4a6a-aadb-70f3dc88a745");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1239");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("6f91eee5-47c3-4796-b593-4914ef104eea");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1240");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("9201643b-7e5c-4775-bd3c-a1cc8a06887d");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1241");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("a98dad5e-7ae7-4969-b2e1-142884f1c345");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1242");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("80e1b43d-1826-4435-a3ab-ade07ced880c");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1243");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("d5127cd7-67db-4415-9651-73fd27025a7b");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1244");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("7e4e6fc8-5a62-407c-981b-22ee6636e472");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1245");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("8a80284f-cbc4-467e-809f-7a857a6875f2");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1246");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("85cd1d9b-0e47-4013-ad5b-a936f1bb2158");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);

        info.setTripId("G1247");
        info.setTrainTypeId(gaoTieOne);
        info.setRouteId("079527ba-40ab-49a1-a81f-5fd9136d676d");
        info.setStartingStationId(shanghai);
        info.setStationsId(suzhou);
        info.setTerminalStationId(taiyuan);
        info.setStartingTime(new Date("Mon May 04 14:00:00 GMT+0800 2013")); //NOSONAR
        info.setEndTime(new Date("Mon May 04 20:51:52 GMT+0800 2013")); //NOSONAR
        service.create(info,null);
    }
}
