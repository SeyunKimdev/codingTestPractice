package ksy;

import java.util.Arrays;

public class IntervalX {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
        System.out.println(Arrays.toString(solution(4,3)));
        System.out.println(Arrays.toString(solution(-4,2)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

//        overflow가 발생할 수 있어 answer[i] = i * x 는 안됨
        answer[0] = x;
        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}
