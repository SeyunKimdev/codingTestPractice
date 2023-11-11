package ksy;

// 삼총사
public class ThreeMusketeers {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{60,50},{30,70}, {60, 30}, {80,40}};         // 4000
        int[][] arr2 = new int[][]{{10, 7},{12, 3}, {8, 15}, {14, 7}, {5, 15}}; // 120
        int[][] arr3 = new int[][]{{14, 4},{19, 6}, {6, 16}, {18, 7}, {7, 11}}; // 133

        System.out.println(solution(arr1)); // 4000
        System.out.println(solution(arr2)); // 120
        System.out.println(solution(arr3)); // 133
    }

    public static int solution(int[][] sizes) {
        int x = sizes[0][0];    // 무조건 제일 큰 수로 고정
        int y = sizes[0][1];    // 제일 작은 수를 넣은 다음 가능한 범위 안에서 가장 작은 수


        for (int i = 0; i < sizes.length; i++) {
//            제일 큰수가 x에 들어가게 만듬
            x = Math.max(sizes[i][0], x);
            x = Math.max(sizes[i][1], x);
//            제일 작은수가 y에 들어아게 만듬
            y = Math.min(sizes[i][0], y);
            y = Math.min(sizes[i][1], y);
        }

//        System.out.println("x : " + x + " y : " + y);

        for (int i = 0; i < sizes.length; i++) {
            if (y < sizes[i][1] && y < sizes[i][0]){
                y = Math.min(sizes[i][0], sizes[i][1]);
            }
        }

//        System.out.println("x : " + x + " y : " + y);

        return x*y;
    }

//    배울 코드
    public static int solution2(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }

}
