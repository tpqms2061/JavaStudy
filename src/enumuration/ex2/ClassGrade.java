package enumuration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003


    //private 생성자 추가 => 누가 혼돈되지 않게 하기 위해 private로 생성을 막아버림
    private ClassGrade() {

    }

}
