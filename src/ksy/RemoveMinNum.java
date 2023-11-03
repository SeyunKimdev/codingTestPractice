package ksy;

import java.util.Arrays;

// 제일 작은 수 제거하기
public class RemoveMinNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));    // {4, 3, 2}
        System.out.println(Arrays.toString(solution(new int[]{10})));            // {-1}
        System.out.println(Arrays.toString(solution(new int[]{101, 102})));            // {102}
        System.out.println(Arrays.toString(solution(new int[]{2050, 2051, 2056})));            // {2051, 2056}
    }

    public static int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        for (int num : arr){
            min = Math.min(min, num);
        }

        int j = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[j] == min ? arr[++j] : arr[j];
            j++;
        }

        return answer;
    }

//    배울 코드
    public int[] solution2(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
