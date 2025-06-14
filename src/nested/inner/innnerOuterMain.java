package nested.inner;

public class innnerOuterMain {

    public static void main(String[] args) {

        innerOuter outer = new innerOuter();
        innerOuter.Inner inner = outer.new Inner();
        inner.prrint();

        System.out.println("inner = " + inner);
    }
}
