import java.util.*; 

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {}; 

        List<Integer> tmp = new ArrayList<>();

        for (int i = l; i <= r; i++) {

            //  5의 배수만 후보
            if (i % 5 != 0) continue;

            int num = i / 5; // 55->11,  555->111, 50->10 ...
            boolean ok = true;

            //  자리수 검사: 0 또는 1로만 구성되어야 함
            while (num > 0) {
                int digit = num % 10;
                
                if (digit != 0 && digit != 1) {
                    ok = false;
                    break;
                }
                num /= 10;
            }

            //  몫이 0/1 패턴이면 원래 숫자 i는 '0과5로만 구성된 수'
            if (ok) tmp.add(i);
        }

        //  결과가 없다면 [-1] 
        if (tmp.isEmpty()) {
            answer = new int[]{ -1 };
            return answer;
        }

        //  answer 배열로 옮기기 
        answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i); // answer배열에 tmp원소 저장
        }

        return answer;
    }
}
