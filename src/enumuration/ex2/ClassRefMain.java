package enumuration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("Class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("Class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("Class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);

    }
}
