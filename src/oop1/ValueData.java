package oop1;

public class ValueData {
    int value; // 데이터 정의

    void add() {
        value++;
        System.out.println("숫자 증가:"+value);
    }//클래스 안에 메소드 생성11
    // 메서드는 객체를 생성해야 호출 가능
    // static이 붙으면 객체 생성 안하고도 메소드 호출가능
}
