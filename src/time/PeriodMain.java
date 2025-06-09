package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {

        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용
        LocalDate curruntDate = LocalDate.of(2030, 1, 1);
        System.out.println("curruntDate = " + curruntDate);
        LocalDate plusDate = curruntDate.plus(period);
        System.out.println("plusDate = " + plusDate);


        //기간차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간 = " + between.getMonths() +"개월" + between.getDays() + "일");
    }
}
