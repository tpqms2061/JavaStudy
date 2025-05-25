package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog(); // Animal dog = new Dog : 상속 받았기 때문에 부모는 자식 참조 가능
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animalArr = {dog, cat, caw}; //부모는 자식을 담을수있다 -> 상속 받았기 때문에

        for (Animal animal : animalArr) {
            System.out.println("동물 테스트 시작 ");
            animal.sound();
            System.out.println("동물 테스트 종료");
        }



    }

}
