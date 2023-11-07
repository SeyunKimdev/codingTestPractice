package ksy;

import java.util.Arrays;

// 행렬의 덧셈
public class AddOfMatrix {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1,2},{2,3}};
        int[][] arr2 = new int[][]{{3, 4},{5, 6}};
        int[][] arr3 = new int[][]{{1},{2}};
        int[][] arr4 = new int[][]{{3},{4}};
        System.out.println(Arrays.deepToString((solution(arr1, arr2))));
        System.out.println(Arrays.deepToString((solution(arr3, arr4))));

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
