package ksy;

import java.util.Arrays;
import java.util.stream.LongStream;

// n^2 배열 자르기
public class ArrangementIncision {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 2, 5))); // [3,2,2,3]
        System.out.println(Arrays.toString(solution(4, 7, 14)));// [4,3,3,3,4,4,4,4]
    }

//    수정 코드
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];

        int num = 0;
        for (long i = left; i <= right; i++) {
            answer[num++] = (int) Math.max(i % n + 1, i / n + 1);
        }

        return answer;
//        배울 코드
//        return LongStream.rangeClosed(left, right).mapToInt(value -> (int) (Math.max(value / n, value % n) + 1)).toArray();
    }

//    기존 코드
//    public static int[] solution(int n, long left, long right) {
//        int[] answer = new int[(int) (right - left + 1)];
//        int[][] arr = new int[n][n];
//        int[] arr2 = new int[n * n];
//
////        원래 코드
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr[0].length; j++) {
////               if (i == j) {
////                   arr[i][j] = i + 1;
////               } else {            // i == 몫, j == 나머지
////                   arr[i][j] = Math.max(i, j) + 1;
////               }
////               arr2[i * n + j] = arr[i][j];
////            }
////        }
//
////        System.out.println(Arrays.deepToString(arr));
////        System.out.println(Arrays.toString(arr2));
//
//        return answer;
//    }
}
