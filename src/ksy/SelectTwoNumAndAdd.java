package ksy;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// 두개 뽑아서 더하기
public class SelectTwoNumAndAdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1}))); // 	[2,3,4,5,6,7]
        System.out.println(Arrays.toString(solution(new int[]{5,0,2,7})));   // 	[2,5,7,9,12]
    }

    public static Integer[] solution(int[] numbers) {
        Integer[] answer;
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = set.toArray(new Integer[0]);

        return answer;
    }
}
