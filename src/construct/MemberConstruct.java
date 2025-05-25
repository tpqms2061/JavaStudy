package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;


    //추가 -> 생성자는 class명과 똑같음
    MemberConstruct(String name, int age) {
        this(name, age, 50); //간략적으로 변경 -> 무조건 첫번째 줄에 작성해야됨 /두번째안됨

    }
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ", grade=" + grade);
        this.name = name;
        this.age= age  ;
        this.grade= grade;
    }
//생성자는 반환타입 x void / int 없이 클래스명으로 정의]
//생성자는 클래스명과 같다
}
