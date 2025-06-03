package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple , Banna,Orange";

        //split()
        String[] splitstr = str.split(",");

        for (String s : splitstr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String string : splitstr) {
            joinStr += string +"-";

        }

        System.out.println("joinstr = " + joinStr);

        //join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열:" + joinedStr);

        //문자열 배열 연결
        String result = String.join("`", splitstr);
        System.out.println("result : "+ result);
    }
}
