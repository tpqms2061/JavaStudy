package Array;

import javax.swing.plaf.InsetsUIResource;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println();

        //향상된 for문, for-each문 -> iter치면 나옴
        for (int nuber : numbers) {
            System.out.println(nuber);
        }
        //for -each 사용할수 없는 경우, 증가하는 index값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i+ "번쨰 결과는"+ numbers[i]);
        }


    }
}
