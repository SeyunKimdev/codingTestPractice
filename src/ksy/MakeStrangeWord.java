package ksy;

// 이상한 문자 만들기
public class MakeStrangeWord {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));  // TrY HeLlO WoRlD
        System.out.println(solution("  tRy hello  WORLD    "));  // TrY HeLlO WoRlD
    }

    public static String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ",-1);

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length(); j++) {

                if (j % 2 == 0) {
                    if (temp[i].charAt(j) >= 97 && temp[i].charAt(j) <= 122) {
                        answer += (char) (temp[i].charAt(j) - 32);
                    } else answer += temp[i].charAt(j);
                } else {
                    if (temp[i].charAt(j) >= 65 && temp[i].charAt(j) <= 90) {
                        answer += (char) (temp[i].charAt(j) + 32);
                    } else answer += temp[i].charAt(j);
                }
            }
            if(!(i==temp.length-1)) answer+= " ";
        }
        return answer;
    }

//    배울 코드
    public static String solution2(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
