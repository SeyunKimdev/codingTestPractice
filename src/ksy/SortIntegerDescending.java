package ksy;

import java.util.Arrays;
import java.util.Comparator;

// 정수 내림차순으로 배치하기
public class SortIntegerDescending {
    public static void main(String[] args) {
        System.out.println(solution(118372));   // 873211
    }

    public static long solution(long n) {
        Object[] answer;
        String number = n + "";
        String answerNumber = "";
        answer = Arrays.stream(number.split("")).sorted(Comparator.reverseOrder()).toArray();
        for (Object num : answer){
            answerNumber += num;
        }
        return Long.parseLong(answerNumber);
    }
}
