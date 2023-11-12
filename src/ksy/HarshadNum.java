package ksy;

// 하샤드 수
public class HarshadNum {
    public static void main(String[] args) {
        System.out.println(solution(10));   // true
        System.out.println(solution(12));   // true
        System.out.println(solution(11));   // false
        System.out.println(solution(13));   // false
    }

    public static boolean solution(int x) {
        String num = x + "";
        String[] nums = num.split("");
        int sum = 0;

        for (String n : nums){
            sum += Integer.parseInt(n);
        }

        return x % sum == 0;
//        return x % sum == 0 ? true : false;
    }
}
