package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointException
        System.out.println("bigData.dat.value" + bigData.data.value);
    }
}

