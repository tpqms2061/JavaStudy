package enumuration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("value= "+ Arrays.toString(values));

        for (Grade value : values) { //value,name : 이름 / ordinal 배열의 순서 표시
            System.out.println("name= " + value.name() +", ordinal " + value.ordinal());
        }

        //String -> Enm 변환, 잘못된 문자면 IllegealArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold=" + gold); //toString () 오버라이딩 가능


    }

}
