import java.util.*;

class Solution {
    public int[] solution(String my_string) {
         int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i); //현재 조회하는 문자
            int idx = 0;  //인덱스

            if (Character.isUpperCase(c)) {
                // 'A' → 0, 'B' → 1 ... 'Z' → 25
                idx = c - 'A';
            } else {
                // 'a' → 26, 'b' → 27 ... 'z' → 51
                idx = (c - 'a') + 26;
            }
            answer[idx]++;
        }

        return answer;
    }
}