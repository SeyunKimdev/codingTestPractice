package ksy;

// 나누어 떨어지는 숫자 배열
import java.util.Arrays;

public class DivisibleNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 6}, 10)));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(n -> n % divisor == 0).sorted().toArray();

        if (answer.length < 1) return new int[]{-1};

        return answer;
    }
}
