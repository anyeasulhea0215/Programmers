class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        /*

        section만 순회해라 (1~n 전체를 돌 필요 없음)

   “아직 칠되지 않은 첫 구역”을 만나면 → 그 지점에서 롤러로 m 길이 칠하기

      칠한 범위 끝을 저장해 두고  → 그 범위를 넘어간 section 원소만 다시 칠하기

       이 과정 반복 → answer++         
        */
        
       for (int i = 0; i < section.length; ) {

    answer++; // 롤러칠함 

    int start = section[i];  //section[1]=3 , section[2]=6
    int end = start + m - 1;  //end=6 , end=9

    // end 이하인 구역을 모두 건너뛴다 → i를 직접 증가
    while (i < section.length && section[i] <= end) {
        i++;  //i=2 , i=3
    
     }
    }
        
        return answer;
    }
}