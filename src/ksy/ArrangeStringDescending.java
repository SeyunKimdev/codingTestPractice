package ksy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

// 문자열 내림차순으로 배치하기
public class ArrangeStringDescending {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg")); // gfedcbZ
    }

    public static String solution(String s) {
        return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }

    public static String solution2(String s) {
        String answer = "";

        Object[] arr = Arrays.stream(s.split("")).toArray();
        Arrays.sort(arr, Collections.reverseOrder());

        for (Object c : arr){
            answer += c;
        }

        return answer;
    }


//  배울 코드
    public String reverseStr(String str){
//        char 배열 만들어서 str 담아줌
        char[] sol = str.toCharArray();
//        정렬
        Arrays.sort(sol);
//        StringBuilder 사용하여 거꾸로
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
