package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello javja";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.Deco(s);

        System.out.println("before" + s);
        System.out.println("after" + deco);

    }
}
