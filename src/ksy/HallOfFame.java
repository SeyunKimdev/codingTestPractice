package ksy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 명예의 전당
public class HallOfFame {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));                 // [10, 10, 10, 20, 20, 100, 100]
        System.out.println(Arrays.toString(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));   // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
//            System.out.println("list : " + list);
            if (i < k) {
                answer[i] = list.get(i);
            } else {
                answer[i] = list.get(k - 1);
            }
        }

        return answer;
    }
}
