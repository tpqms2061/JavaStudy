package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {

        for (String availableZondId  :ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZondId = " + availableZondId);
            ZoneId zoneId = ZoneId.of(availableZondId);
            System.out.println(zoneId + "| " +zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Aisa/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);

    }
}
