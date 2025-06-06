package lang.wrapper;

public class WrapperClassMain {
    //wrapper Class: 기본형 타입을 객체형으로 만드는것으로 Interger.valueOf를 사용하여 객체안의 밸류안에 숫자를 저장함 Boxing
    //int XX = interger XX. intvalue() : 하여 안에 저장된 숫자를 불러냄

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제 예정 , 대신에 valueOf() 사용
        Integer integerobj = Integer.valueOf(10); //-128 ~127 자주 사용하는 숫자값 재사용, 불변 //대부분 Valueof 를 사용해야됨
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(200);
        System.out.println("doubleObj = " + doubleObj);
        System.out.println("longObj = " + longObj);
        System.out.println("integerobj = " + integerobj);
        System.out.println("newInteger = " + newInteger);

        System.out.println("내부값 읽기");
        int intValue = integerobj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerobj)); //다른 참조를 보기 떄문에 false
        System.out.println("equals: " + (newInteger.equals(integerobj))); //안에 값이 같은지 확인
    }
}
