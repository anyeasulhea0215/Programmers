import java.util.*;

class Solution {
    public int findIndex(String [] name, String target){
        
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
       
        int []answer=new int [photo.length];

        for(int i=0;i<photo.length;i++) {
            
            int sum=0;
            for(int j=0; j<photo[i].length;j++){
              // sum=sum+yearning[name.indexOf(photo[i][j]) ];
               
                String person=photo[i][j];
                
                int index=findIndex(name,person);
                
                if(index != -1) {
                    sum+=yearning[index];
                }
                
            }
            
            answer[i]=sum;
        }
        return answer;
    }
    //photo -> photo [ 사진 1, 사진2 ] [ {kail, ma} , { may,kain}]
    //answer 배열에 사진별 추억 점수 합.
    /*
     name->사람 이름의 문자열 배열 [may,kein,kain], yearing -> 각 사람별 추억점수 [10,2,5]
     .. photo 에는 name에 있는 모든 사람들이 없ㅇ르수도 잇음
     일단 name의 길이 만큼 yearing의 점수를 각각 매핑. -> 반복문?
    */
        
}