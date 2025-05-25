package poly.ex2;

import javax.swing.*;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 테스트 시작 ");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }

}
