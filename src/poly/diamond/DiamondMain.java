package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.MethodA();
        a.MethdoCommon();

        InterfaceB b = new Child();
        b.MethdoCommon();
        b.MethodB();
    }

}
