package Method;

public class Methodreturn1 {

    public static void main(String[] args) {
        boolean result = odd(1);
        System.out.println(result);


    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        } // boolean 은 무조건 true/ false 값이 반환되야됨
    }
}
