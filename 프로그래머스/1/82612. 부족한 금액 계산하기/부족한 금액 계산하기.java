class Solution {
    public long solution(int price, int money, int count) {

        long total = 0; 

        // N번째 이용 금액 price * N
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;  
        }

        // 부족하면 절댓값 반환, 아니면 0
        if (total > money) {
            return total - money;   // 부족 금액
        } else {
            return 0;
        }
    }
}
