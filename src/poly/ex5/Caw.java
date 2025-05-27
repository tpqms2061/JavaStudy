package poly.ex5;

public class Caw implements InterfaceAnimal {
    @Override
    public void move() {
        System.out.println("소이동");
    }

    @Override
    public void sound() {
        System.out.println("음매");
    }
}
