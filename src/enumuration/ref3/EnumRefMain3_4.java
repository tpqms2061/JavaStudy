package enumuration.ref3;
//출력중복 제거


public class EnumRefMain3_4 {

    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade,price);
        }

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);

    }

    private static void printDiscount(Grade grade, int price) {

        System.out.println(grade.name()+ " 등급의 할인 금액 :" + grade.discount(price));
    }

}
