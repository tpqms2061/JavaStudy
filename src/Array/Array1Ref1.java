package Array;

public class Array1Ref1 {

    public static void main(String[] args) {

        int[] students; //배열변수 선언
        students = new int[5];//배열 개수 생성

        System.out.println(students); //배열 생성시 참조값이 부여됨. stdents 호출시 참조값 나타남

        //변수값 대입
        students[0] =90;
        students[1] =80;
        students[2] =70;
        students[3] =60;
        students[4] =50;


        System.out.println("학생1 점수:" + students[0]);
        System.out.println("학생2 점수:" + students[1]);
        System.out.println("학생3 점수:" + students[2]);
        System.out.println("학생4 점수:" + students[3]);
        System.out.println("학생5 점수:" + students[4]);

    }
}
