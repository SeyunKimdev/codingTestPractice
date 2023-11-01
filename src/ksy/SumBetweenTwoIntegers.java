package ksy;

// 두 정수 사이의 합
public class SumBetweenTwoIntegers {
    public static void main(String[] args) {
        System.out.println(solution(3, 5)); // 12
        System.out.println(solution(3, 3)); // 3
        System.out.println(solution(5, 5)); // 12
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a == b) return a;

        if (a > b) {
            while (a != b){
                answer += b++;
            }
            return answer + a;
        } else {
            while (a != b){
                answer += a++;
            }
            return answer + b;
        }
    }
}
