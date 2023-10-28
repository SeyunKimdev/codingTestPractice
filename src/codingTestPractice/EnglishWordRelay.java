package codingTestPractice;

import java.util.Arrays;

public class EnglishWordRelay {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));

    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {};
        int length = words.length;
        int wrongPerson = 0;
        int wrongPersonsOrder = 0;
        int samePart = 0;
        int wrongPart = 0;

//        중복을 제거한 후에도 길이가 같다면 끝말잇기가 무사히 끝나거나 누군가가 잘못 말한 것 길이가 다르다면 누군가 중복된 단어를 말한 것
        if (length == Arrays.stream(words).distinct().toArray().length){
//            0이 리턴되면 잘못된 부분 없음
            if (findWrongWord(words) == 0){
                return new int[]{0, 0};
            } else {
                wrongPerson = findWrongWord(words) % n + 1; // 인원 3명인데 3번째 나올 경우 + 1 후 한번 더 나눠야할 수 도 있음
                wrongPersonsOrder = findWrongWord(words) / n + 1;

                wrongPerson = wrongPerson > n ? wrongPerson - n : wrongPerson;

                return new int[]{wrongPerson, wrongPersonsOrder};
            }
        } else {    // 중복된 경우가 있는 경우 중복된 부분을 찾아야 함 + 혹시 중복도 됐지만 중복 되기전 틀린 단어를 말할 수 있으므로 그것부터 검색
//            중복도 있지만 잘못된 단어를 말한 경우
            if (findWrongWord(words) != 0){
//                wrongPerson = findWrongWord(words) % n + 1; // 인원 3명인데 3번째 나올 경우 + 1 후 한번 더 나눠야할 수 도 있음
//                wrongPersonsOrder = findWrongWord(words) / n + 1;
//
//                wrongPerson = wrongPerson > n ? wrongPerson - n : wrongPerson;
//
//                return new int[]{wrongPerson, wrongPersonsOrder};
                wrongPart = findWrongWord(words);
            }

            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])){
                        samePart = i >= j ? i : j;
//                        wrongPerson = samePart % n + 1;
//                        wrongPersonsOrder = samePart / n + 1;
//
//                        wrongPerson = wrongPerson > n ? wrongPerson - n : wrongPerson;
//
//                        return new int[]{wrongPerson, wrongPersonsOrder};
                    }
                }
            }

            if (samePart >= wrongPart && wrongPart != 0){
                wrongPerson = findWrongWord(words) % n + 1; // 인원 3명인데 3번째 나올 경우 + 1 후 한번 더 나눠야할 수 도 있음
                wrongPersonsOrder = findWrongWord(words) / n + 1;

                wrongPerson = wrongPerson > n ? wrongPerson - n : wrongPerson;

                return new int[]{wrongPerson, wrongPersonsOrder};
            } else {
                wrongPerson = samePart % n + 1;
                wrongPersonsOrder = samePart / n + 1;

                wrongPerson = wrongPerson > n ? wrongPerson - n : wrongPerson;

                return new int[]{wrongPerson, wrongPersonsOrder};
            }
        }
    }

    public static int findWrongWord(String[] words){
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)){
                return i;
            }
        }
        return 0;
    }
}
