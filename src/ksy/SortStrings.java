package ksy;

import java.util.*;

// 문자열 내 마음대로 정렬하기
public class SortStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
}
