package ksy;

import java.util.ArrayList;
import java.util.Arrays;

// 같은 숫자는 싫어
public class HateSameNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1})));    // {1,3,0,1}
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));        // {4,3}
    }

    public static int[] solution(int []arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        int beforeNum = arr[0];
        arr2.add(beforeNum);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr2.get(arr2.size() - 1)){
                arr2.add(arr[i]);
            }
            beforeNum = arr[i];
        }

        return arr2.stream().mapToInt(Integer::intValue).toArray();
    }
}
