package ksy;

import java.util.Stack;

// 괄호 회전하기
public class TurnBracket {
    public static void main(String[] args) {
        System.out.println(solution("[](){}")); // 3
        System.out.println(solution("}]()[{")); // 2
        System.out.println(solution("[)(]"));   // 0
        System.out.println(solution("}}}"));    // 0

    }

    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer += (check(s)) ? 1 : 0;
            s = s.substring(1, s.length()) + s.substring(0,1);
        }
        return answer;
    }
    public static boolean check(String str) {
        Stack<Character> ch = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') { ch.push(str.charAt(i)); } else {
                if (!ch.isEmpty()) {
                    char c = ch.pop(), s = str.charAt(i);
                    if(c == '(' && s == ')') { continue; }
                    else if(c == '{' && s == '}') { continue; }
                    else if(c == '[' && s == ']') { continue; }
                    else { return false; }
                } else {return false;}
            }
        }
        if(ch.isEmpty()) { return true; } else { return false; }
    }

//    public static int solution(String s) {
//        int answer = 0;
//        String flag = "";
//        String[] brackets = s.split("");
//
//        for (int i = 0; i < brackets.length; i++) {
//            if (checkRight(brackets)) answer++;
//            flag = brackets[0];
//            for (int j = 0; j < brackets.length; j++) {
//                if (j == brackets.length - 1) {
//                    brackets[j] = flag;
//                } else {
//                    brackets[j] = brackets[j+1];
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    public static boolean checkRight(String[] brackets){
//        String str = "";
//        for (int i = 0; i < brackets.length; i++) {
//            str += brackets[i];
//        }
//
//        while (true){
//            if (str.length() == 0) {
//                return true;
//            }
//            if (str.startsWith("(")){
//                if (str.contains(")")){
//                    str = str.replaceFirst("\\(","");
//                    str = str.replaceFirst("\\)","");
//                } else {
//                    break;
//                }
//            } else if (str.startsWith("[")){
//                if (str.contains("]")){
//                    str = str.replaceFirst("\\[","");
//                    str = str.replaceFirst("\\]","");
//                } else {
//                    break;
//                }
//            } else if (str.startsWith("{")){
//                if (str.contains("}")){
//                    str = str.replaceFirst("\\{","");
//                    str = str.replaceFirst("\\}","");
//                } else {
//                    break;
//                }
//            } else {
//                break;
//            }
//        }
//        return false;
//    }
}
