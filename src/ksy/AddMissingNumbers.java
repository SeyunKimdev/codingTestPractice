package ksy;

// 없는 숫자 더하기
import java.util.Arrays;

public class AddMissingNumbers {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));   // 14
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));     // 6
    }

    public static int solution(int[] numbers) {
        int answer = 45;
        numbers = Arrays.stream(numbers).distinct().toArray();

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }

    // 배울 코드
    public static int solution2(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }

}
