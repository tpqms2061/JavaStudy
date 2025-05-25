package fianal1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //final 이기 때문에 참조값 변경 x

        Data data1 = new Data();

        //참조 대상의 값은 변경 가능
        data.value =10;
        System.out.println(data.value);
        data.value=20;
        System.out.println(data.value);
    }
}
