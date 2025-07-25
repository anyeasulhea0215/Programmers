class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numk=String.valueOf(k); //k의 문자열 형태 저장
        
        String str=String.valueOf(num);
        
       for(int i=0;i<str.length();i++){
           
           String msg=str.substring(i,i+1);
           //num의 각각의 숫자를 문자열로저장->반복문안에서 numk와 비교
           if(numk.equals(msg)){
               answer=i+1;
               break;
           }
           
       }
        return answer;
    }
}