package codingTestPractice;

import java.util.*;

public class Lifeboat {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{70,50,80,50}, 100));  // 3
        System.out.println(solution(new int[]{70,80,50}, 100)); // 3
    }

    public static int solution(int[] peoples, int limit) {
        peoples = Arrays.stream(peoples).sorted().toArray();

//        List<Integer> list = new ArrayList<>();
//        for(int x : peoples) list.add(x);
//        Collections.sort(list);

        // 꼭 사이즈 지정 필요
        ArrayDeque<Integer> dq = new ArrayDeque<>(50000);
        for(int x : peoples) dq.add(x);

        int answer = 0;
        while(dq.isEmpty() == false) {
//            제일 무거운 사람 무게 빼낸 후 담아줌
            int weight = dq.pollLast();
//            peek 은 데이터를 보존한채로 가장 처음에 들어간 데이터를 반환
//            poll은 pop 처럼 데이터를 빼낸 다음에 반환
//            dq 가 비었지 않고 제일 무거운 사람과 가장 가벼운 사람의 합이 limit 보다 작거나 같다면
            if(dq.isEmpty() == false && weight + dq.peekFirst() <= limit) { dq.pollFirst(); }
            answer++;
        }

        return answer;
    }

//    다른 사람의 풀이
    public static int anotherSolution(int[] people, int limit) {
//        순서대로 정렬
        Arrays.sort(people);
//        for문의 선언부 부분을 위에서 선언 후 for문에서 선언부 생략
        int i = 0, j = people.length - 1;
        for (; i < j; --j) {
//            남은 사람들 중 가장 가벼운 사람과 무거운 사람의 무게의 합이 limit 과 같거나 작다면 i 에 1추가 없다면 j만 늘어나서 다음으로 무거운 사람 데려와서 검사 반복
            if (people[i] + people[j] <= limit)
                ++i;
        }
//        1명씩 탈 경우의 수 - 2명씩 탈 수 있는 경우의 수
        return people.length - i;
    }
}
