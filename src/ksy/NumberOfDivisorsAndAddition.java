package ksy;

// 약수의 개수와 덧셈
public class NumberOfDivisorsAndAddition {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));   // 43
        System.out.println(solution(24, 27));   // 52
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer += getDivisors(i) % 2 == 0 ? i : -i;
        }

        return answer;
    }

    public static int getDivisors(int num){
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += num % i == 0 ? 1 : 0;
        }

        return result;
    }
}
