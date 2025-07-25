import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        //int[] numbers={10,20,1,5,103,23}
        /*앞자리가 가장 큰수가 제일 앞에 와야할듯..
         배열들의 앞자리 비교.?  ->각 배열들의 앞자리 수만 뽑아야와햠 -->각 숫자를 문자열 배열로 변환..?
         
         ->문제점: 9,3,30,34->실제 결과와 다름 
        */
        
        String[] strNumbers=new String[numbers.length];  //숫자들을 문자열 배열로 변환
        
        for(int i=0;i<numbers.length;i++){
            strNumbers[i]=String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNumbers,(a,b) -> (b+a).compareTo(a+b));  //정렬 a+b/b+a를 비교해 내림차순 정렬
        
        if(strNumbers[0].equals("0")){
            return  "0";
        }
        
        //정렬된 문자들을 이어붙이기
        StringBuilder sb=new StringBuilder();
        for(String s:strNumbers){
            sb.append(s);
        }
        
        return sb.toString();
    }
}