package lang.object.equals;

public class EqulsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2))); // equals 는 object 에서 기본적으로 ==으로 정의됨//즉 오버라이딩 해야됨
    }
}
