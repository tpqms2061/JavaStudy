package Method;

public class Method1Ref {

    public static void main(String[] args) {

        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);

        System.out.println("=======================");

        //계산2

        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);

    }
    //add 메서드 생성
    public static int add(int a, int b) { //메서드 선언
        System.out.println(a +"+"+ b +"연산수행");
        int sum = a+b;
        return sum;
    //public : 다른 클래스에서 호출할 수 있는 클래스
    //static : 객체 생성하지않고 호출할수있는 정적 메서드
    //메서드의 결과를 반환하려면 retuen문 사용해야됨 반환할 결과 적어줘야됨.
    }
}
