package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설명" + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelarate();
        car.offEngine();
    }
}
