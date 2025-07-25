class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        
        while(n>=a){ //a=2
            int freecoke=(n/a)*b;
            
            int remain=(n%a)+freecoke;
            
            answer+=freecoke;
            n=remain;
        }
        return answer;
    }
}