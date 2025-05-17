package Scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("가격 입력");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("종료");
                break;
            }

            System.out.println("수량 입력");
            int quantity = scanner.nextInt();
            int sum = price* quantity;

            System.out.println("총비용:" + sum);


        }
    }
}
