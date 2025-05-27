package poly.car1;

public class Model3Car implements Car {
    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");

    }

    @Override
    public void pressAccelarate() {
        System.out.println("Model3Car.pressAccelarate");
    }

    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }
}
