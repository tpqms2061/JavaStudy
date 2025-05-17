package Scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum =0;
        int number=0;
        int count=0;

        System.out.println("숫자를 입력하세요 -1 입력시 종료");

        while (true) {

            number=scanner.nextInt();


            if (number == -1) {
                System.out.println("종료");
                break;
            }

            sum += number;
            count++;

        }
    // while ((number= scanner.nextInt()) != -1) {
    //        sum +=number;
    //        count++;   -> 이렇게 요약가능

        double average= (double) sum/count;
        System.out.println("합계 :" + sum);
        System.out.println("평균 :" + average);
    }
}
