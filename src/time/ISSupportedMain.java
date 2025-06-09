package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class ISSupportedMain {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        int minutes = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minutes = " + minutes);
    }
}
