package ksy;

// 가운데 글자 가져오기
public class GetMiddleLetter {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));  // c
        System.out.println(solution("qwer"));   // we
    }

    public static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0){
            answer = s.split("")[s.length() / 2 - 1] + s.split("")[s.length() / 2];
        } else {
            answer = s.split("")[s.length() / 2];
        }

        return answer;
    }
}
