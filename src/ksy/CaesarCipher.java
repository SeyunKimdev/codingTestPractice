package ksy;

// 삼총사
public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));      // BC
        System.out.println(solution("z", 1));       // a
        System.out.println(solution("a B z", 4));   // e F d
    }

    public static String solution(String s, int n) {
        String answer = "";

        for (int j = 0; j < n; j++) {
            answer = "";
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == ' ')){
                    answer += " ";
                } else if (s.charAt(i) == 'z'){
                    answer += "a";
                } else if (s.charAt(i) == 'Z') {
                    answer += "A";
                } else {
                    char c = s.charAt(i);
                    answer += (char)(c + 1);
                }
            }
            s = answer;
        }
        return answer;
    }
}
