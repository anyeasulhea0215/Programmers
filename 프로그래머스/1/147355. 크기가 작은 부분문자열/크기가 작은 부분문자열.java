class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long pnum=Long.parseLong(p);
        
        /*
         문자열 t중에서 길이가 p의 길이와 같은 문자열을 추출
         ->그문자열들을 parseInt로 정수변환 해서 p의 정수값과 비교 
         ->작거나 같은 수들이 발견될때마다 answer++
         ex) t=12345 -> 123,234,345  ==> t.length -2
         
          => i = 0,1,2 /  sub(0,3) sub(1,4) sub (2,5)
          
          
          t=12345 , p=23 -> 
          12,23,34,45 -> sub(0,2) sub (1,3) sub (2,4) .. sub (3,5)
        */
        
        for(int i=0;i<t.length()-p.length()+1;i++){
            String s=t.substring(i,i+p.length());
            Long num=Long.parseLong(s);
            
            if(num<= pnum){
                answer++;
            }
        }
        
        return answer;
    }
}