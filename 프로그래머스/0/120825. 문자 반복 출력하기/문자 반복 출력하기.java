class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[]unit=my_string.toCharArray();
        
        for(int i=0;i<my_string.length();i++){
            for(int j=0;j<n;j++){
                 answer+=unit[i];
            }
        }
        
        return answer;
    }
}