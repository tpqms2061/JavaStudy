package lang.string;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x02
        System.out.println("new String()== 비교" + (str1 == str2)); //참조값 비교
        System.out.println("new String() equals 비교:" + (str1.equals(str2))); //안에 들어간 밸류 비교

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터널  == 비교:" + (str3 == str4));
        System.out.println("리터널 equals == 비교:" + (str3.equals(str4)));

    }
}
