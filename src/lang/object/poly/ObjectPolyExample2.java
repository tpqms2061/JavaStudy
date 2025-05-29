package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {


        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object인스턴스도 만들수있습니다

        Object[] objects = {dog, car, object};
     /*   object[] objects = new object[3];
        objects[0] = dog;
        objects[1] = car;
        objects[2] = object; */
        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length );
    }
}
