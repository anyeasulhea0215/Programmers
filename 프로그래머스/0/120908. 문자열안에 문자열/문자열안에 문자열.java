class Solution {
    public int solution(String str1, String str2) {
        // str1 안에서 str2가 부분 문자열로 있는지 확인
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            String msg = str1.substring(i, i + str2.length());
            if (msg.equals(str2)) {
                return 1;  // 일치하면 1을 반환
            }
        }
        
        // str1 안에 str2가 없으면 2를 반환
        return 2;
    }
}
