class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
         int [] arr= new int[included.length];
        
        /*
         3,7,11,15,19 =>37
         7,8,9,10,11,12,13
         일단등차수열의 각각항 저장
        */
        
        for(int i=0;i<included.length;i++){
            arr[i]=a+i*d;
            
            if(included[i] == true){
                answer+=arr[i];
            }
        }
        return answer;
    }
}