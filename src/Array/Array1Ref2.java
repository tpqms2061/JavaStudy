package Array;

public class Array1Ref2 {

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

        System.out.println(students.length);//students.length : 배열 갯수

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1)+ "점수: " + students[i]);
        }

    }
}
