package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void MethodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void MethodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void MethdoCommon() {
        System.out.println("Child.MethodCommon");


    }
}
