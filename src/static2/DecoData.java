package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근 에러  / 컴파일 에러
        //instancecMethod(); //인스턴스 메서드 접근 x// 컴파일 에러

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근 가능
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod(); //인스턴스 메서드 접근가능

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근 가능
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue" + instanceValue);

    }

    private static void staticMethod() {
        System.out.println("staticValue"+ staticValue);
    }
}
