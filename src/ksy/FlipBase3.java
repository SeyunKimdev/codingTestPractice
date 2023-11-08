package ksy;

// 3진법 뒤집기
public class FlipBase3 {
    public static void main(String[] args) {
        System.out.println(solution(45));       // 7
        System.out.println(solution(125));      // 229
    }

    public static int solution(int n) {
        int answer = 0;
        String base3Num = getBase3(n);
        System.out.println("base3Num : " + base3Num);

        for (int i = 0; i < base3Num.length(); i++) {
            System.out.println("@@@@@" + base3Num.split("")[i]);
            answer += Math.pow(3, base3Num.length()- 1 - i) * Integer.parseInt(base3Num.split("")[i]);
        }

        return answer;
    }

    public static String getBase3(int n){
        String result = "";

        while (n != 0){
            result += n % 3;
            n = (n - n % 3) / 3;
        }

        return result;
    }
}
