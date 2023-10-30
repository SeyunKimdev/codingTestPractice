package ksy;

public class FindRemain1 {
    public static void main(String[] args) {
//        System.out.println(solution(10));
//        System.out.println(solution(12));
        System.out.println(solution2(10));
        System.out.println(solution2(12));
    }

    public static int solution(int n) {
        int min = n-1;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return min;
    }

    public static int solution2(int n){
        int i = 1;
        while (true){
            if (n % i == 1){
                return i;
            }
            i++;
        }
    }
}
