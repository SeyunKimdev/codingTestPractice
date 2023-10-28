package codingTestPractice;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }
    public static int[] solution(int brown, int yellow) {
        int sum = brown + yellow;

        return findWidthLength(yellow, sum);
    }

    public static int[] findWidthLength(int yellow, int sum){
        int width = 0, length = 0;

        for(int i = 1; i <= yellow; i++){
            if(yellow % i == 0){
                width = Math.max(i, yellow / i);
                length = Math.min(i, yellow / i);
                if((width + 2) * (length + 2) == sum){
                    break;
                }
            }
        }

        return new int[]{width + 2, length + 2};
    }
}
