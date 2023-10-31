package ksy;

public class LongJump {
    public static void main(String[] args) {
        System.out.println(solution(4));    // 5
        System.out.println(solution(3));    // 3
        System.out.println(solution(5));    // 8
        System.out.println(solution(6));    // 13
    }

    // 1 2 3 4 5 6  7 <- n
    // 1 2 3 5 8 13 21 < - result
    public static long solution(int n) {
//        if (n <= 2 && n > 0) return n;

        long[] arr = new long[2001];
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }

//        return (solution(n - 1) + solution(n - 2)) % 1234567;
        return arr[n] % 1234567;
    }
}
