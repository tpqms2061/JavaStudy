package Scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println(" 1: 상품입력 , 2: 결제, 3:프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine(); //위 설정이 엔터를 안누러서 다음줄로 해야됨

                System.out.println("상품명 입력");
                String prduct = scanner.nextLine();

                System.out.println("가격 입력");
                int price = scanner.nextInt();

                System.out.println("구매수량을 입력");
                int quantity = scanner.nextInt();
                totalCost +=  price*quantity;
                System.out.println("상품명:" + prduct + "가격:" + price + "수량:" + quantity + "합계+" + totalCost);

            } else if (option ==2) {
                System.out.println("총비용" +totalCost);
                totalCost =0;

            } else if (option==3) {
                System.out.println("프로그램 종료");
                break;

            } else {
                System.out.println("올바른 선택해주세요");
            }

        }
    }
}
