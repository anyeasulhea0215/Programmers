class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //소수의 개념->자기자신을 1~자기자신 까지 나눈 수들이1,자기자신 이라면 소수..->count가 3이상이면 합성수
        
        
        for(int i=1;i<n+1;i++){ //i:15이하의 합성수 확인할 수들
            int count=0;
            
            for(int j=1;j<i+1;j++){ //j:i의 약수들 확인
                if(i%j==0){
                    count++; //약수 개수 증가
                }
            }//i의 대한 확인 종료
            if(count>2){
                answer++; //합성수 개수 세기
                }
        }
        return answer;
    }
}