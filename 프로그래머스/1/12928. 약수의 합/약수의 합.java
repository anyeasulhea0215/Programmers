class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count=0;
        int sum=0;
        
        //n의 약수 구하기
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                count++;  //약수의 개수
                sum=sum+i;
            }           
        }
        
        return sum;
    }
}