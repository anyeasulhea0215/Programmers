function solution(slice, n) {
    var answer = 0;
    
    answer=~~(n/slice);
    if((n%slice)>0){
        answer=answer+1;
    }
    return answer;
}