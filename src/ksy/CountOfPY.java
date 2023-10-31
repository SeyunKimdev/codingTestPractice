package ksy;

// 문자열 내 p와 y의 개수
public class CountOfPY {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));    // true
        System.out.println(solution("Pyy"));        // false
    }

    public static boolean solution(String s) {
        int countOfP = 0, countOfY = 0;

        s = s.toLowerCase();

        String[] arr = s.split("");

        for (String str : arr){
            if (str.equals("y")) countOfY++;
            if (str.equals("p")) countOfP++;
        }

        if (countOfP == countOfY) return true;
        else return false;
    }

//  다른 분 코드! 람다 사용함
    boolean solution2(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
