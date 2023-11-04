package ksy;

// 수박수박수박수박수박수? <- 문제이름
public class RepeatSuBak {
    public static void main(String[] args) {
        System.out.println(solution(3));    // 수박수
        System.out.println(solution(4));    // 수박수박
    }

    public static String solution(int n) {
        String answer = "";

//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                answer += "수";
//            } else {
//                answer += "박";
//            }
//        }

        for (int i = 0; i < n; i++) {
            answer += i % 2 == 0 ? "수" : "박";
        }

        return answer;
    }
}
