package Casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류
        intValue =(int) doubleValue; // 형변환 => 소숫점 떼고 강제로 넣겠다
        System.out.println(intValue);
    }
}
