class Solution {
    public int solution(int order) {
        int answer = 0;
        String msg=String.valueOf(order);
        char[]unit=msg.toCharArray();
        
        for(int i=0;i<unit.length;i++){
            if(unit[i]=='3'||unit[i]=='6'||unit[i]=='9'){
                answer++;
            }
        }
        return answer;
    }
}