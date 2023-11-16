package ksy;

import java.util.*;

// K번째 수
public class KthNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2,5,3}, {4,4,1}, {1,7,3}})));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
        }

        return answer;
    }
//    배울 코드
//            Arrays.copyOfRange(원본 배열, 복사할 길이);
//            Arrays.copyOfRange(원본 배열, 복사할 시작 인덱스, 복사할 끝 인덱스); 인덱스는 0부터 시작 기준
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);


}
