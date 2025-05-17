package Casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doulbeValue;

        longValue = intValue; // int -> long
        System.out.println("longValue =" + longValue);

        doulbeValue = intValue; //int -> double
        System.out.println("longValue =" +doulbeValue);

        doulbeValue = 20L; // long -> double
        System.out.println("doubleValue2=" + doulbeValue);


    }
}
