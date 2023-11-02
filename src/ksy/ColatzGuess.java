package ksy;

// 콜라츠 추측
public class ColatzGuess {
    public static void main(String[] args) {
        System.out.println(solution(6));        // 8
        System.out.println(solution(16));       // 4
        System.out.println(solution(626331));   // -1

    }

    public static int solution(long num) {
        int answer = 0;

        while (num != 1){
            if (num % 2 == 0) {
                num /= 2;
                answer++;
            } else {
                num = num * 3 + 1;
                answer++;
            }

            if (answer > 500) return -1;
        }
        return answer;
    }

}
