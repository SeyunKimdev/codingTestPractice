package ksy;

import java.util.HashSet;

// 연속 부분 수열 합의 개수
public class NumberOfSums {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,9,1,1,4})); // 18
    }

    public static int solution(int[] elments){
        HashSet<Integer> sums = new HashSet<>();
        for (int i = 1; i <= elments.length; i++) {
            for (int j = 0; j < elments.length; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += elments[(j + k) % elments.length];
                }
                sums.add(sum);
            }
        }
        return sums.size();
    }

//    public static int solution(int[] elments){
//        int answer = 0;
//
//        HashSet<Integer> sums = new HashSet<>();
//        for (int i = 1; i <= elments.length; i++) {
//            for (int j = 0; j < elments.length; j++) {
//                sums.add(getSum(elments, j, i));
//            }
//        }
//        answer = sums.size();
//
//        System.out.println(sums);
//
//        return answer;
//    }
//
//    public static int getSum(int[] elments, int startIdx, int count){
//        int answer = 0;
//
//        for (int i = 0; i < count; i++) {
//            answer += elments[(startIdx + i) % elments.length];
//        }
//
//        return answer;
//    }

}
