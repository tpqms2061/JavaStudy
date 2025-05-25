package static1;

public class Data3 {

    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++; //원칙 Data3.count 인데 같은 클래스 내부이므로 생략가능
    }
}
