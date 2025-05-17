package Method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입 x");
            return;
        } //return 이 있어야 메서드를 나올수있음 없으면 메서드 전체가 실행됨

        System.out.println(age + "살 , 입장하세여");
    }
}
