package ksy;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }

    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        String[] arr = str.split("");

        for (String num : arr){
            answer += Integer.parseInt(num);
        }

        return answer;
    }
}
