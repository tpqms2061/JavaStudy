package lang.immutable.address;

public class RefMain2_1 {


    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 방법은 없다
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        //b.setValue("부산"); //컴파일 오류 값변경 안됨
        b= new ImmutableAddress("부산"); // 불변객체인것을 확인하고 새로운 객체를 만들어 Value값을 넣어준다
        System.out.println("부산 -> b");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
