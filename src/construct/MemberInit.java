package construct;

public class MemberInit {

    String name;
    int age;
    int grade;


    //추가
    void initMemeber(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

        //this는 안의 스콥안의 변수가 아닌 인스턴스의 참조값을 가르킴
    //즉 member1의 x001이 되는것임 x001.name 
}
