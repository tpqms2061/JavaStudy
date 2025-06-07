package enumuration.ref2;




public class DiscountService {

    public int discount(Grade grade, int price) {

//        int discountPercent = grade.getDiscountPercent();
//        return price *  discountPercent / 100;

        return price * grade.getDiscountPercent() / 100;
    }
}
