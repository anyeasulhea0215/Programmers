class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
       for (int i = 0; i < numbers.length; i++) {
          answer -= numbers[i];
         }
        /*
         number에서 없는 숫자 더하는 변수= x 
         
         numbers[i]와  1~9 j를 비교 ->없는 numbers[i]를 answer에 합산
         
         반복문몇번.? 
        */
        return answer;
    }
}