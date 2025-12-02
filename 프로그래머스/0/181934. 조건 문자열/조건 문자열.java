class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0; // 기본값

        // "=" 조합이면 >= 또는 <=
        if (eq.equals("=")) {

            // "<=" 조합
            if (ineq.equals("<")) {
                if (n <= m) answer = 1;
                else answer = 0;
            }

            // ">=" 조합
            else {
                if (n >= m) answer = 1;
                else answer = 0;
            }
        }

        // "!" 조합이면 < 또는 >
        else {

            // "<" 조합
            if (ineq.equals("<")) {
                if (n < m) answer = 1;
                else answer = 0;
            }

            // ">" 조합
            else {
                if (n > m) answer = 1;
                else answer = 0;
            }
        }

        return answer;
    }
}
