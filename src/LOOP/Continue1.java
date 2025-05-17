package LOOP;

public class Continue1 {
    public static void main(String[] args) {
        int i =1;
        while (i<=5){
            if (i==3){
                i++;
                continue; // continue는 건너뛴다 i=3 이면 건너뛴다는 말
            }
            System.out.println(i);
            i++;
        }
    }
}
