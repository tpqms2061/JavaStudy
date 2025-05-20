package Class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student students1 = new Student();
        students1.name = "학생1";
        students1.age = 15;
        students1.grade = 90;

        Student students2 = new Student();
        students2.name = "학생2";
        students2.age= 16;
        students2.grade = 80;

        System.out.println();

        Student[] students = new Student[2];
        students[0] = students1;
        students[1] = students2;

        System.out.println("이름:"+ students[0].name+"나이:"+students[0].age+ "성적:"+students[0].grade);
        System.out.println("이름:"+ students[1].name+"나이:"+students[1].age+ "성적:"+students[1].grade);







    }
}
