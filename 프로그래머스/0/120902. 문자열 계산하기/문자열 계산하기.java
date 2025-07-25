class Solution {
    public int solution(String my_string) {
       
        String[] myList=my_string.split(" ");
       int answer=Integer.parseInt(myList[0]);
        
        for(int i=1;i<myList.length-1;i+=2){
            String operator=myList[i];
            int number=Integer.parseInt(myList[i+1]);
            
            if(operator.equals("+")){
                answer+=number;
            }
            else{
                answer-=number;
            }
        }
        return answer;
    }
}