class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
           
     while(chicken>=10){
         int freechi=chicken/10;
         int reminder=chicken%10;
         answer+=freechi;
         chicken=reminder+freechi;
     }
        
        
        return answer;
    }
}