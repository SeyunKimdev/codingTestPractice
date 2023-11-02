package ksy;

// 핸드폰 번호 가리기
public class HidePhoneNumber {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        String[] numbers = phone_number.split("");
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            if (i >= numbers.length - 4) {
                answer += numbers[i];
            } else {
                answer += "*";
            }
        }

        return answer;
    }
}
