package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello javja";
        String deco = DecoUtil2.deco(s); //정적 메소드 덕에 객체 생성없이 클래스 접근으로 인해 바로 호출가능

        System.out.println("before" + s);
        System.out.println("after" + deco);

    }
}
