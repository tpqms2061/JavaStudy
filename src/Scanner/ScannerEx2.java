package Scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다");
        }else {
            System.out.println("홀수입니다.");
        }
    }
}
