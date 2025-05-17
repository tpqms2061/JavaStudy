package Array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2x3 2차원 배열 생성
        int[][] arr = {
                {1,2,3},
                {4,5,6},


        };
//arr.length : 행의 길이 {1,2,3} ,{4,5,6} :2개
//arr[row].length : 열의 길이 -> 행안의 갯수 {1,2,3} -> 3개
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();

        }

    }
}
