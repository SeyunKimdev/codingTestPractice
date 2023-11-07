package ksy;

import java.util.Arrays;

// 최대 공약수와 최소 공배수
public class GcdAndLcm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));   // 3, 12
        System.out.println(Arrays.toString(solution(2, 5)));    // 1, 10
    }
    public static int[] solution(int n, int m) {
        return new int[]{getGCD(n, m), getLCM(n, m)};
    }

    public static int getGCD(int num1, int num2){
        int result = 0;
        for (int i = 1; i < Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                result = Math.max(result, i);
            }
        }
        return result;
    }

    public static int getLCM(int num1, int num2){
        return num1 * num2 / getGCD(num1, num2);
    }
}
