package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력하세여 ( 0을 입력시 종료)");
            int number = input.nextInt();

            if (number == 0) {
                System.out.println("종료됩니다.");
                break;
            }
            sum += number;


        }
        System.out.println("입력한 모든 정수 합: " + sum);
    }
}


