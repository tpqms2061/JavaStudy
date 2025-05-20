package Class1;

public class ClassStart5 {

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

        Student[] students = new Student[]{students1, students2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:"+ students[i].name+"나이:"+students[i].age+ "성적:"+students[i].grade);

        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; //간략하게 선언하는것
            System.out.println("이름:"+ s.name+"나이:"+s.age+ "성적:"+s.grade);

        }
        for (Student s : students) {
            System.out.println("이름:"+ s.name+"나이:"+s.age+ "성적:"+s.grade);
        } // 향상된 for문 ->iter








    }
}
