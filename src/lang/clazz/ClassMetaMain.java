package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class; //1. 클래스에서 조회

        //Class clazz1 = new String().getClass(); //2. 인스턴스에서 조회
       // Class clazz2 = Class.forName("java.lang.String"); //forName 을 쓰렴녀 상단에 throws Exception  써야됨

        //모든 필드 출력
        Field[] fileds = clazz.getDeclaredFields();

        for (Field filed : fileds) {
            System.out.println("filed.getType()+ \"\" = " + filed.getType()+ "" + filed.getName());

        }
        
        //모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //상위 클래스 정보 출력
        System.out.println("SuperClass: " + clazz.getSuperclass().getName());

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("interface:  " + i.getName());
        }
    }
}
