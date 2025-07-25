class Solution {
    public int solution(int n) {
        int answer = n/7;
        if((n%7)!=0){
            answer++;
        }
        return answer;
        
    } //사람이 7의 배수가 아니면 ->answer++
}