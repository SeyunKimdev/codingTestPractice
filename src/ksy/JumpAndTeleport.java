package codingTestPractice;

public class JumpAndTeleport {
    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(5000));

    }

    public static int solution(int destination) {
        int answer = 1;

        while (destination != 1){
            if (destination % 2 == 0){
                destination /= 2;
            } else {
                answer++;
                destination--;
            }
        }
        return answer;
    }
}
