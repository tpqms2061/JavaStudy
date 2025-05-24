package access.b;

import access.a.PublicClass;

import java.util.zip.Deflater;

public class PublicClassOuterMain {

    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();

        //다른 패키지 불가
        //DefaultClass clas = new DefaultClass();
    }
}
