package construct;

public class ConstructMain1 {

    //앞에 클래스에 생성자를 정의했는데 생성자 안에 파라미터를 정의했으면 그대로 정의해야됨.
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:"+ s.name+" 나이:" +s.age+"성적:"+s.grade);

        }
    }
}
