package lang;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //현재 시간( 밀리초 )를 가져온다

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        
        //현재시간을 (나노초)로 가져온다

        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        //환경변수를 읽는다 -> 운영체제가 사용하는것
        System.out.println("getenv" + System.getenv());

        // 시스템 속성을 읽는다 -> 자바가 사용하는 속성
        System.out.println("properties = "+ System.getProperties());
        System.out.println("Java Version= " + System.getProperty("java.version"));

        //배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);

        //배열 출력
        System.out.println("copiedArray =" + copiedArray); //참조값이 나옴
        System.out.println("copiedArray =" + Arrays.toString(copiedArray)); // 들어간 배열 문자가 나옴

        // 프로그램 종료
        System.exit(0);

    }
}
