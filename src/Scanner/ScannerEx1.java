package Scanner;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름를 입력하세요");
        String name = scanner.nextLine();

        System.out.println("나이를 입력하세요");
        String age = scanner.nextLine();

        System.out.println("당신의 이름은 " + name +" 나이는" + age);


    }
}
