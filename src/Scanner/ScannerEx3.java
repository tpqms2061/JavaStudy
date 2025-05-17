package Scanner;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음식을 입력");
        String foodname = scanner.nextLine();

        System.out.println("가격을 입력");
        int foodPrice = scanner.nextInt();

        System.out.println("수량을 입력");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice + foodQuantity;
        System.out.println(foodname + foodQuantity+"개를 주문하셨습니다 ");
        System.out.println("총가격은 " + totalPrice + "원 입니다");
    }
}
