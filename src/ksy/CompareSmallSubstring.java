package ksy;

// 크기가 작은 부분 문자열
public class CompareSmallSubstring {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));     // 2
        System.out.println(solution("500220839878", "7"));  // 8
        System.out.println(solution("10203", "15"));        // 3
    }

    public static int solution(String t, String p) {
        int answer = 0;
        String[] nums = t.split("");

        for (int i = 0; i <= nums.length - p.length(); i++) {
            String num = "";
            for (int j = i; j < i + p.length(); j++) {
                num += nums[j];
            }
            if (Long.parseLong(num) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}
