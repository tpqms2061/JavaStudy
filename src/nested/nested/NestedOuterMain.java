package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
//        NestedOuter outer = new NestedOuter();  지워도됨 아무관계없음 중첩이랑
        NestedOuter.Nested  nested = new NestedOuter.Nested();
        nested.print();


        System.out.println("nestedClass = " + nested.getClass());

    }
}
