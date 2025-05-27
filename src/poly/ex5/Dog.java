package poly.ex5;

public class Dog implements InterfaceAnimal{ //interface 는 상속받을떄 implements사용

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
