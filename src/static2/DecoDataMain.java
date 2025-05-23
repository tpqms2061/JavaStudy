package static2;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();
        // 이러면 data3 (객체 ) 인스턴스를 통해서 호출된담에 메소드가 static인걸 보고 클래스로 다시 보내느것으로
        // 이것을 보고 바로 static인 것을 구별 하기어렵기때문에 비추함

        //클래스를 통한 접근
        DecoData.staticCall();

    }
}
