class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len=num_list.length;
        
        int mul=1;
        int sum=0;
        int sum2=0;
        
        if(len<=10 && len>1){
            for(int i=0;i<len;i++){
          if(num_list[i]>0 && num_list[i]<10)
          {
              mul*=num_list[i]; 
           sum+=num_list[i];  } 
        }
            
        }
        
        sum2=sum*sum;
        
        if(mul<sum2)
            answer=1;
        else
            answer=0;
        
        return answer;
    }
}