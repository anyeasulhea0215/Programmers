class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
       
        int a=0;
        int b=0;
        
        for( int i=0;i<goal.length;i++){
            String s=goal[i];
            
            if(a< cards1.length && cards1[a].equals(s)){
                a++;
            }else if(b<cards2.length && cards2[b].equals(s)){
                b++;
            }else{
                return "No";
            }
           
        }
         return "Yes";
       
        /*
         cards1, cards2 를 조합하여 문자열 배열 생성, 
         goal의 각 원소와 생성한 문자열 원소을 각각 비교
          xx  
          
          => cards1,cards2의 각 인덱스를 생성하여 인덱스 위치의 원소와 goal인덱스 원소를 비교..          
        */
        
    }
}