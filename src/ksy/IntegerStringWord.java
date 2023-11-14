package ksy;

import java.util.HashMap;
import java.util.Map;

// 숫자 문자열과 영단어
public class IntegerStringWord {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));     // 1478
        System.out.println(solution("23four5six7"));        // 234567
        System.out.println(solution("2three45sixseven"));   // 234567
        System.out.println(solution("123"));                // 123
    }

    public static int solution(String s) {
        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);

        for (Map.Entry<String, Integer> number : numbers.entrySet()){
            if (s.contains(number.getKey())){
                s = s.replaceAll(number.getKey(), number.getValue()+"");
            }
        }

        return Integer.parseInt(s);
    }
}
