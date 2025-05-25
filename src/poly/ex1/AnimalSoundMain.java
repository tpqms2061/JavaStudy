package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");

        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 종료");

        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 종료");

        //타입 ( Dog /Cat /Caw 의 타입이 다르기 떄문에 메소드/ 배열/for문으로 중복 제거 불가능


    }



}
