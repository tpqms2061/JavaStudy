package poly.ex6;

import poly.ex5.InterfaceAnimal;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chiken chiken = new Chiken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chiken);

        flyAnimal(bird);
        flyAnimal(chiken);
    }
    //AbstractAnimal 사용가능
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }
    //Fly 인터페이스 있으면 사용가능

    private static void flyAnimal(Fly fly) {
        System.out.println("동물 날기테스트 시작");
        fly.fly();
        System.out.println("동물 날기 테스트 종료");
    }
}
