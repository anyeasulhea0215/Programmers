class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
         
        int[] arr=new int[k];
        int size=0; //arr에 들어간 실제 갯수      
        
        for(int i=0;i<score.length;i++){ 
            
            int now=score[i];
           
            if(size<k){
                arr[size]=now;
                size++;
            } else{
                //k일 이후 -> arr []= {10,20,100}
                  int min = arr[0]; //min=10
                int minIndex = 0; //minindex=0

                // arr 내부 최소값 찾기
                for (int j = 1; j < k; j++) {
                    if (arr[j] < min) {
                        min = arr[j];  //min=10
                        minIndex = j; //minindex
                    }
                }

                // 새 점수가 최소값보다 크면 교체
                if (now > min) {  //now=150 .>10
                    arr[minIndex] = now;  // --> arr[0]=150
                }
            } 
           
            //매번 arr에서 최소갑을 answer에 더함
            int minToday=arr[0];
            for(int j=0;j<size;j++){
                if(minToday>arr[j]){
                    minToday=arr[j];
                }
            }
            answer[i]=minToday;
        }
           
        
        return answer;
    }
}