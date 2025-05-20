package ref;

public class Varchange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value =10;
        Data dataB = dataA; //안에 값(Value)을 복사하는게 아니라 참조값을 복사하는것 !!

        System.out.println("dataA 참조값:" + dataA);
        System.out.println("dataB 참조값:" + dataB);
        System.out.println("dataA.value:" + dataA.value);
        System.out.println("dataB.value:" + dataB.value);



        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value:" + dataA.value);
        System.out.println("dataB.value:" + dataB.value);

        //dataB 변경
        dataA.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value:" + dataA.value);
        System.out.println("dataB.value:" + dataB.value);



    }






}
