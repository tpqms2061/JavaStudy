package Scanner;

public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp;

        temp=a;
        a =b; //-< a는 20으로 바뀐상태
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
