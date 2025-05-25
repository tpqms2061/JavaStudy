package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count =" + Data3.count);
        //count 는 static으로 설정해놨음 . 그래서 이전과 다르게 클래스에 직접 접근하여  Data3.count 로 호출하는것
        //이전은 data1.count 식으로 인스턴스에 접근

        Data3 data2 = new Data3("B");
        System.out.println("B count =" + Data3.count);

        Data3 data3 = new Data3("B");
        System.out.println("B count =" + Data3.count);

        }
}



