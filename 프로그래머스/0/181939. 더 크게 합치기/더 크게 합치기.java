public class Solution {
    public static int solution(int a, int b) {
       
        int num=0;
        int num2=0;
        
        String str=Integer.toString(a); //9
        String str2=Integer.toString(b); //String , 91
        
        
          num=Integer.parseInt(str.concat(str2)); //991
        num2=Integer.parseInt(str2.concat(str));  //919
        
        if(num>num2){
          return num;
        }else{
            return num2;
        }

    }
}