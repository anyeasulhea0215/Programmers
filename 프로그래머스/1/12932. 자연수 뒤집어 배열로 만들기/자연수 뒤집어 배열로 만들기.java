class Solution {
    
    public int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
    
    public int[] solution(long n) {
        String s = Long.toString(n); 
        
      int[] answer=new int[s.length()];
       
        
        for(int i=0;i<s.length();i++){
            answer[i]=Character.getNumericValue(s.charAt(i)); //배열 answer에 s원소 각각 저장
        }
        
        reverseArray(answer);
        
        
        return answer;
    }
}