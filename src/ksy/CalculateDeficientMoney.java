package ksy;

// 부족한 금액 계산하기
public class CalculateDeficientMoney {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4)); // 10
    }

//   놀이기구를 탈때마다 이용료가 N배로 올라감 ex) 1 -> 100, 2 -> 200, 3 -> 300
    public static long solution(long price, long money, long count) {
        long answer = (money - (count + 1) * count / 2 * price);
        if (answer >= 0) return 0;
        return -answer;

//        조건문 사용 안하고 바로 리턴
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
