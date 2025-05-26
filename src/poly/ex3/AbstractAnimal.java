package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound();//추상메소드를 생성하기위해서는 무조건 클래스가 추상이어야됨

    public void move() {
        System.out.println("동물이 움직입니다");
    }
}
