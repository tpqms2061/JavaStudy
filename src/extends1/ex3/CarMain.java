package extends1.ex3;


public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();
        gasCar.openDoor();

        HyedrogenCar hyedrogenCar = new HyedrogenCar();
        hyedrogenCar.move();
        hyedrogenCar.fillHydrogen();
        hyedrogenCar.openDoor();
    
    }


}
