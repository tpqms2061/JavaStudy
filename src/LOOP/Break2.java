package LOOP;

public class Break2 {

    public static void main(String[] args) {
        int sum =0;
        int i =1;

        for (; ;) { //for문에 조건식이 없으면 무한 반복한다 -> 그래서 break를 통해서 빠져나온다
            sum =sum+i;
            if (sum >=10){
                System.out.println("합이 10보다 크면 종료: i= "+i + " sum="+sum);
                break;
            }
            i++;
        }
    }
}
