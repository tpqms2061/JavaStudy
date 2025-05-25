package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMemeber(member1, "user1", 15, 90); //아래 메서드 적용


        MemberInit member2 = new MemberInit();
        initMemeber(member2, "user2", 16, 80); //아래 정의된 메서드 적용



        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름:"+ s.name+" 나이:" +s.age+"성적:"+s.grade);
            
        }
    }
    static void initMemeber(MemberInit member, String name, int age, int grade) {
//        member.name =name;
//        member.age =age;
//        member.grade=grade;
    }

}
