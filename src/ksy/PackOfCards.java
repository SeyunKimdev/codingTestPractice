package ksy;

// 카드뭉치
// 아직 못품 수정해야함
public class PackOfCards {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));   // Yes
        System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));   // No
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"can", "win"}, new String[]{"can", "a", "b", "c"}));   // Yes
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0, idx2 = 0;

        for (int i = 0; i < goal.length; i++) {
            if (cards1.length > idx1 && goal[i].equals(cards1[idx1])){
                idx1++;
            } else if (cards2.length > idx2 && goal[i].equals(cards2[idx2])) {
                idx2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
