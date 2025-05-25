package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        Accessdata data = new Accessdata();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField =2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateFiled =3;
        //data.privateMethod();

        data.innerAccess(); //메소드는 내부라서 접근가능
    }
}
