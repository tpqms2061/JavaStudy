package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "hello Java";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime)+ "ms");
    }
}
