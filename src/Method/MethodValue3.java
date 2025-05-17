package Method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num1 =5;
        System.out.println("1. changeNumber 호출 전 , num1:" + num1); //5
        num1 = changeNumber(num1); // num1 에 메소드 값을 대입
        System.out.println("4. changeNumber 호출 후 , num1:" + num1); //10

    }

    public static int changeNumber(int num2) {

       num2 = num2 * 2;
       return num2;  //값을 반환하기 때문에 void x
    }
}
