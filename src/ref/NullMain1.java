package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data =null; // null을 넣음으로써 참조값 아직 x
        System.out.println("1.data =" + data);
        data = new Data(); //객체 생성함으로써 참조값 생성
        System.out.println("2.data = "+ data);
        data = null;
        System.out.println("3. data =" +data);
    }
}
