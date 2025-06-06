package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {

        Class helloClass = Hello.class;
//        Class helloClass = Class.forName("lang.clazz.Hello");

       Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); //hello클래스가 가진 생성자를 얻어서 객체 생성
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
