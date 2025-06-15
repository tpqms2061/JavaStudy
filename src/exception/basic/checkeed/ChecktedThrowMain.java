package exception.basic.checkeed;

public class ChecktedThrowMain {

    public static void main(String[] args) {

        Service service = new Service();
        service.catchThrow();
        System.out.println("정상종료");

    }
}
