package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toSring 호출");
        System.out.println(car.toString()); // car는 오버라이딩 안해서 object의 tostring 값 호출
        System.out.println(dog1.toString()); //오버라이딩해서 dog 에 설정한 tostring 발생
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toSring 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

       System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
