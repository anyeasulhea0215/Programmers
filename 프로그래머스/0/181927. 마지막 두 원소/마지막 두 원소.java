class Solution {
    public int[] solution(int[] num_list) {
          int len=num_list.length;
        
        int[] answer = new int [len+1];
        
          System.arraycopy(num_list, 0, answer, 0, len); // 기존 배열 복사
        
        int a=num_list[len-1];  //6
        int b=num_list[len-2];  //1
        
        if(b<a){
            answer[len]=a-b;
        }else{
            answer[len]=a*2;
        }
            
        return answer;
    }
}