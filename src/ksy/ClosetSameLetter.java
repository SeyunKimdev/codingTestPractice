package ksy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 가장 가까운 글자
public class ClosetSameLetter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana"))); // [-1, -1, -1, 2, 2, 2]
        System.out.println(Arrays.toString(solution("foobar"))); // [-1, -1, 1, -1, -1, -1]
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            answer[i] = -1;
            list.add(s.charAt(i));
            for (int j = list.size() - 2; j >= 0; j--) {
//                System.out.println("list : " + list);
//                System.out.println("j : " + j + " i : " + i);
//                System.out.println("list(j) : " + list.get(j));
//                System.out.println("s.charAt(i) : " + s.charAt(i));
//                System.out.println("answer : " + Arrays.toString(answer));
                if(list.get(j) == s.charAt(i)) {
//                    System.out.println("같아서 들어옴@@@");
                    answer[i] = i - j;
                    break;
                }
//                System.out.println("한바퀴 돔\n");
            }
        }
        return answer;
    }

//    배울 코드
    public int[] solution2(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
//            HashMap은 동일 키 값을 추가하면 value의 값이 덮어쓰기 됨 따라서 for문이 돌면서 같은 문자값으로 들어오면 가장 가까운 문자의 위치가 value에 담김
//            map.getOrDefault(Object key, V DefaultValue) key : 값을 가져와야 하는 요소의 키 // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
//            존재하지 않는 경우 i - (i + 1)이 되기 때문에 -1 이 담김
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}
