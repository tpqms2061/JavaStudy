package Casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intvalue = 0;

        intvalue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue ="+ intvalue);

        intvalue = (int) maxIntOver; //형변환
        System.out.println("maxIntOnver casting=" +intvalue);
        //2147483648은 int의 최곳값인 2147483647 을 넘을시에는 최곳값인
        // 최저값인 -2147483647에 +1을 하게된다. ==> -2147483647 +1 이 되는것
    }
}
