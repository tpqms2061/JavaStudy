package Method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); //double을 int 에 대입하므로 컴파일 오류
        printNumber((int) number); // 형이 다르면 에러가 뜨기 때문에 명시적 형변환
    }

    public static void printNumber(int n) {

        System.out.println("숫자" +  n);
    }
}
