package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);

         obj1.add(20);

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1= " + obj1.getValue());

        //value값 그대로 받기 떄문에 불변 객체이므로 처음 값 그대로 반환


    }
}
