import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];  // 결과 크기만큼 고정 배열 생성

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;    // 배열은 0부터 시작하므로 -1
            int end = commands[i][1];          // copyOfRange는 end 미포함 → 그대로 사용
            int k = commands[i][2] - 1;        // k번째 → index는 -1
            
            int[] sliced = Arrays.copyOfRange(array, start, end); 
            Arrays.sort(sliced);

            answer[i] = sliced[k];  // i번째 명령의 결과 저장
        }

        return answer;
    }
}
