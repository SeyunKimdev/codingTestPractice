package ksy;

// JadenCase 문자열 만들기
public class JadenCase {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));  // 3people Unfollowed Me
        System.out.println(solution("for the last week"));      // For The Last Week
        System.out.println(solution("  3people  unFollowed  me ")); //   3people  Unfollowed  Me
        System.out.println(solution("  for the what 1what  ")); //   For The What 1what
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] words = s.toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()){
                answer.append(" ");
            } else {
                answer.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
                if (i != words.length - 1) answer.append(" ");
            }
        }

        if (s.endsWith(" ")) answer.append(" ");

        return answer.toString();
    }

//    배울 코드
    public static String solution2(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
