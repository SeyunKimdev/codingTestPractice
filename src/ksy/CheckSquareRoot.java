package ksy;

public class CheckSquareRoot {
    public static void main(String[] args) {
        System.out.println(solution(121)); // 144
        System.out.println(solution(3)); // -1

    }

//    public static long solution(long n) {
//        long answer = -1;
//
//        for (int i = 0; i < n; i++) {
//            if (i * i == n) return (i + 1) * (i + 1);
//        }
//
//        return answer;
//    }

    public static long solution(long n) {
        long answer = 0;

        double checkNum = Math.sqrt(n);

        System.out.println(Math.pow((int)checkNum, 2));

        if (Math.pow((int)checkNum, 2) == n){
            return (long) Math.pow((int)checkNum + 1, 2);
        } else return -1;
    }
}
