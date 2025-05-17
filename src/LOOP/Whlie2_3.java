package LOOP;

public class Whlie2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        //i=4, endNum=3

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum" + sum);
            i++;
        }
    }


}
//While문은 변수 i를 while문안에 지정할수 없어서 main 내부에 설정해야됨
//반면 for문은 조건식에 변수 i를 설정할수있어 안에 지정해 메모리 낭비 방지
