class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //배열을 한 string으로 변환
        
        for(int i=0;i<array.length;i++){
            
           String strnum=String.valueOf(array[i]);
           for(int j=0;j<strnum.length();j++){
               if(strnum.charAt(j)=='7'){
                   answer++;
               }
           }
        }
        
        
        return answer;
    }
}