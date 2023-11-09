package ksy;

import java.util.Arrays;

// 예산
public class Budget {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));      // 3
        System.out.println(solution(new int[]{2, 2, 3, 3}, 10));    // 4
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = Arrays.stream(d).sum();
        if (sum <= budget) return d.length;

        Arrays.sort(d);

        int i = 0;
        while (true){
            budget -= d[i++];
            if (budget < 0) break;
            answer++;
        }

        return answer;
    }
}
