package Array;

public class ArrayDi2 {
    public static void main(String[] args) {
        //2x3 2차원 배열 생성
        int[][] arr = new int[2][3]; // 행2. 열3
        arr[0][0] =1; // 0행, 0열
        arr[0][1] =2; // 0행, 1열
        arr[0][2] =3; // 0행, 2열
        arr[1][0] =4; // 1행, 0열
        arr[1][1] =5; // 1행, 1열
        arr[1][2] =6; // 0행, 2열

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();

        }

    }
}
