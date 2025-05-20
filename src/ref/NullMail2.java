package ref;

public class NullMail2 {

    public static void main(String[] args) {
        Data data =null;
        data.value = 10; //NullPointerException : 예외발생
        System.out.println("data = " + data.value);
    }
}
