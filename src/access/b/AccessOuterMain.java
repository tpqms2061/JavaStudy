package access.b;

import access.a.Accessdata;

public class AccessOuterMain {
    public static void main(String[] args) {
        Accessdata data = new Accessdata();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 default 호출 불가
        //data.defaultField =2; -> access.a소속이라 b에서 호출 x
        //data.defaultMethod();

        //private 호출 불가
        //data.privateFiled =3;
        //data.privateMethod();

        data.innerAccess(); //메소드는 내부라서 접근가능
    }
}
