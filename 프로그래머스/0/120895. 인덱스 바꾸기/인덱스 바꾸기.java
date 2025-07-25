class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String str1 = my_string.substring(0, num1); // num1 앞부분
        String str2 = my_string.substring(num1 + 1, num2); // num1과 num2 사이의 부분
        String str3 = my_string.substring(num2 + 1); // num2 뒷부분
        
        // 두 문자를 교환하여 새로운 문자열 생성
        answer=str1 + my_string.charAt(num2) + str2 + my_string.charAt(num1) + str3;
        return answer;
    }
}