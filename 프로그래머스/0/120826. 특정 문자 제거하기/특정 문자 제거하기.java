class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        
        char c=letter.charAt(0);
        
        char[]unit=my_string.toCharArray();
        
        for(int i=0;i<my_string.length();i++){
        if(unit[i]!=c){
            answer+=unit[i];
        }
        }
        return answer;
    }
}