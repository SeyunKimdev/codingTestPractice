package ksy;

import java.util.Arrays;

// 자연수 뒤집어 배열로 만들기
public class FlipNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345))); // {5, 4, 3, 2, 1}
    }

    public static int[] solution(long n) {
        String[] numbers = String.valueOf(n).split("");
        int[] answer = new int[numbers.length];

        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            answer[j++] = Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}
