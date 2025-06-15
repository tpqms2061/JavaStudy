package exception.basic.checkeed;

public class CheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상종료");

    }
}
