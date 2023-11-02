package ksy;

public class FindKim {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"})); // "김서방은 1에 있다"
    }

    public static String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) return "김서방은 " + i + "에 있다";
        }
        return null;
    }
}
