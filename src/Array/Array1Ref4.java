package Array;

public class Array1Ref4 {

    public static void main(String[] args) {

       // int[] students; //배열변수 선언
        int[] students = {90,80,70,60,50 };//배열  생성과 초기화 최적화

        System.out.println(students); //배열 생성시 참조값이 부여됨. stdents 호출시 참조값 나타남


        System.out.println(students.length);//students.length : 배열 갯수

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1)+ "점수: " + students[i]);
        }

    }
}
