class Solution {
    public String solution(String str1, String str2) {
         StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));  // str1에서 한 문자 추가
            answer.append(str2.charAt(i));  // str2에서 한 문자 추가
        }
        
        return answer.toString();
        
    }
}