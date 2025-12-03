class Solution {
    
    //약수의 개수를 리턴하는 함수
public int func(int num){
    int answer=0;
    
    for(int i=1;i<num+1;i++){
        if(num%i==0){
            answer++;
        }
    }
    
    return answer;
}
    
    
    public int solution(int left, int right) {
        int answer = 0;
        
        
        for(int i=left; i<right+1;i++){
             int n=func(i); //약수의 개수 변수
            
            if(n%2==0){
                answer+=i;
            }else{
                answer=answer-i;
            }
        }
        
        return answer;
    }
}

