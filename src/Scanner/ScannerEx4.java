package Scanner;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇단");
        int dan = scanner.nextInt();

        System.out.println(dan + "단의 구구단");

        for (int i = 1; i <= 9; i++) {
            int sum = dan * i;
            System.out.println(dan+ "*" + i + "=" + sum);
        }
    }
}
