package lang.string.method;

public class StringComparisionMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부
        String str2 = "hello, java!"; //대문자 x 전부 소문자
        String str3 = "Hello, World";

        System.out.println("str1 equals str2:" + str1.equals(str2));
        System.out.println("str1 equlasIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); //대소문자 구분없이 함

        System.out.println("`b' compareTo 'a':" + "b".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareTo str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 strats with `Hello':" + str1.startsWith("Hello"));
        System.out.println("str1 strats with `Hello':" + str1.endsWith("Java"));

    }
}
