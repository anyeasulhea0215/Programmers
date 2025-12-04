class Solution {
    public long solution(long number, long limit, long power) {
        long answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = countDivisors(i); // 약수 개수

            // limit 이하이면 그대로, 초과하면 power
            answer += (cnt <= limit) ? cnt : power;
        }

        return answer;
    }

    public int countDivisors(int num) {
        int count = 0;

        // √num 까지만 검사
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                // i가 약수, num/i도 약수
                if (i * i == num) {
                    count += 1; // 제곱수일 때는 하나만 증가
                } else {
                    count += 2; // i와 num/i 두 개
                }
            }
        }

        return count;
    }
}
