package lang.string;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x02
        System.out.println("메서드 호출 비교 1:" + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2:" + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y) {

        //return x==y; //new String 이 올지 문자열이 나올지 모르니까 equals로 해야됨
        return x.equals(y);

    }
}



