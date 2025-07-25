class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for(int num=1; n>=num*num ;num++)
        {
            if(n==num*num){
                answer=1;
                break;
            }
            
        }
        
        return answer;
    }
}