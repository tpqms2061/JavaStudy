package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("현재시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        //계산 (불변)

        LocalTime ofTimePlus = ofTime.plusSeconds(30); //객체 생성
        System.out.println("지정시간 +30s = " + ofTimePlus);

    }
}
