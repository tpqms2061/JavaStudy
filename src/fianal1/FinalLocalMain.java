package fianal1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역변수
        final int data1;
        data1=10; //최초 한번만 할당 가능
        //data1= 20; // 다시 넣을시에는 컴파일 오류

        //final 지역 변수 2
        final int data2 = 10;
        //data2 =20; // 컴파일 오류
        method(10);

    }

    static void method(final int parameter) {
        //parameter = 20; // 처음에 메소드 호출시 10으로 할당 받았기 때문에 다시 20으로 할당 x 컴파일 오류
    }
}
