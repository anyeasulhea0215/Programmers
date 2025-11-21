class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 1) 점수 범위가 1~k 이므로 counting 배열 생성
        int[] count = new int[k + 1];

        // 2) 점수 개수 세기 O(n)
        for (int s : score) {
            count[s]++;
        }

        // 3) 뒤에서부터(고득점부터) 점수를 꺼내서 내림차순 배열을 만든다
        int idx = 0;
        int[] sorted = new int[score.length];

        for (int i = k; i >= 1; i--) {         // 높은 점수부터
            while (count[i]-- > 0) {
                sorted[idx++] = i;            // 내림차순으로 채우기
            }
        }

        // 4) m개씩 묶어서 최소값 계산
        for (int i = m - 1; i < sorted.length; i += m) {
            int minValue = sorted[i];         // 묶음의 최소값
            answer += minValue * m;
        }

        return answer;
    }
}
