package ksy;

public class EvenAndOdd {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int num){
        String answer = "";

        answer = num % 2 == 0 ? "Even" : "Odd";

        return answer;
    }
}
