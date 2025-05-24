package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass class1 = new DefaultClass();
        DefaultClass2 class2 = new DefaultClass2(); //같은 패키지라서 가능함
    }
}