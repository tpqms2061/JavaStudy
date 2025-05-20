package ref;

public class MethodChange2 {

    public static void main(String[] args) {

       Data dataA = new Data();
       dataA.value=10;
        System.out.println("메서드 호출전 : dataA.value"+ dataA.value);
        System.out.println("dataA="+ dataA);
        changeRedference(dataA);

        System.out.println("메서드 호출전 : dataA.value"+ dataA.value);
    }

    public static void changeRedference(Data dataX) {
        System.out.println(dataX);
        dataX.value=20; //dataA = dataX 참조값 같음 => 그러므로 같은vlue 값


    }
}
