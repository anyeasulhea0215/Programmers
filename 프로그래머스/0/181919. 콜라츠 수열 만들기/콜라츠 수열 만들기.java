import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        // 순서 1. 배열을 List로 변환
    List<Integer> list= new ArrayList<>();
        
               
        while(true){
            list.add(n);
            
            if(n == 1){
                break;
            }
            
            if(n % 2 == 0){
                ///even
                n=n/2;  //5
            }else{
                n=3*n+1;
            }
        }
        
  int []answer=new int [list.size()];
        for(int i=0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}

