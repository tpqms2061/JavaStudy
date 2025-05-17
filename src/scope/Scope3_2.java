package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m *2;
            System.out.println("temp =" + temp);
        }
        System.out.println("m=" + m);
    }
}
// temp 가 if 문에서만 사용하는데 굳이 main 문에 설정하여 메모리 낭비할 필요x
// temp 를 메모리 낭비를 위해 if 문 내부에 스코프(범위) 설정
