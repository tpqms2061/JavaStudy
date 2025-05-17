package Scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력한 두 수가 0이면 종료합니다");

        while (true) {
            System.out.println("첫번째 수를 입력하세요");
            int num1 = scanner.nextInt();
            System.out.println("두번째 수를 입력하세요");
            int num2 =scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("0이면 종료됩니다");
                break;
            }else {
                int sum = num1+num2;
                System.out.println("두 수의 합은 :" +sum );
            }



        }
    }
}
