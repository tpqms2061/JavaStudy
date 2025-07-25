package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);


        //계산 (불변)

        ofDate.plusDays(10);
        System.out.println("지정 날짜 +10d= " + ofDate);

        LocalDate plusDays = ofDate.plusDays(10); //모든 날짜 클래스는 불변이므로 객체를 생성해야 바뀜
        System.out.println("plusDays = " + plusDays);

    }
}
