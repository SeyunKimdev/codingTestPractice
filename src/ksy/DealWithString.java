package ksy;

import java.util.Arrays;

// 문자열 다루기 기본
public class DealWithString {
    public static void main(String[] args) {
        System.out.println(solution("a1234"));  // false
        System.out.println(solution("a12345"));  // false
        System.out.println(solution("1234"));   // true
    }

//    수정 코드
    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6){
            try {
                int num = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

//    기존 코드
//    public static boolean solution(String s) {
//        if (s.length() == 4 || s.length() == 6){
//            boolean answer = true;
//            Object[] arr = Arrays.stream(s.split("")).map(c -> isInteger(c)).toArray();
//
//            for (Object b : arr){
//                if (b.equals(false)) return false;
//            }
//
//            return answer;
//        }
//        return false;
//    }
//
//    public static boolean isInteger(String strValue) {
//        try {
//            Integer.parseInt(strValue);
//            return true;
//        } catch (NumberFormatException ex) {
//            return false;
//        }
//    }
}
