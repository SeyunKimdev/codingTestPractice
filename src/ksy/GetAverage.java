package ksy;

public class GetAverage {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
        System.out.println(solution(new int[]{5,5}));
    }

    public static double solution(int[] arr) {
        double answer = 0;

        for (int num : arr){
            answer += num;
        }

        answer /= arr.length;

        return answer;
    }
}
