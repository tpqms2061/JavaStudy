package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {
        //인터페이스는 생성불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");

    }
}
