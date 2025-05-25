package extends1.overriding;

public class ElectricCar extends Car { //Car 의 기능을 다 물려받음

    @Override //실수를 위해 이것은 부모의 기능을 오버라이딩한것이라고 꼭 표시 하는것이 좋음/ 실수를 위해서도 좋음
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다");
    }

    public void charge() {
        System.out.println("충전합니다");

    }

}
