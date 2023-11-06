package ksy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// 할인 행사
public class DiscountEvent {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"})); // 3
        System.out.println(solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));                                                                       // 0
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> lists = new HashMap<>();

            for (int k = 0; k < want.length; k++) {
//                key 값엔 제품, value 에는 사야하는 제품의 수량 담아줌
                lists.put(want[k], number[k]);
            }

            for (int j = i; j < i + 10; j++) {
//                lists 의 key 값 중에 discount[j] -> ex) "apple"
//                "apple"과 같은 key 값이 있다면 그 value를 가져와서 1 빼주고 다시 담아줌
                if (lists.containsKey(discount[j])){
                    lists.put(discount[j], lists.get(discount[j]) - 1);
                }
            }

//            반복을 완료한 후 HashMap의 value 값만 가져와서 Integer형 Collection으로 반환함
            Collection<Integer> values = lists.values();
//            value값들이 모두 0이거나 0보다 크면 num이 values.size와 같아 지기 때문에 그때 answer 을 1 증가 시킴
            long num = values.stream().filter(n -> n <= 0).count();
            if (num == values.size()) answer++;
        }
        
        return answer;
    }
}
