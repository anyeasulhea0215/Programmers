class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
         int num=my_string.length()- n;  //ProgrammerS123 -> Pro (3)
        
        answer=my_string.substring(num);
        
        return answer;
    }
}