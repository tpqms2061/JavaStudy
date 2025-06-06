package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {

//        Random random = new Random();
        Random random = new Random(1); //seed에 숫자를 넣으면 반복 실행해도 Random의 결과가 같다

        int randomInt = random.nextInt();
        System.out.println("random = " + randomInt);

        double randomDouble = random.nextDouble(); //0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);


        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10);//0~9 까지 출력
        System.out.println("0~9 : = " + randomRange1);

        int randomRange2 = random.nextInt(10) +1; // 1~19까지 출력
        System.out.println("randomRange2 = " + randomRange2);
    }
}
