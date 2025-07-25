function solution(n) {
    
    var answer = 2;
    for(let i=1;i<n;i++){
        if((i*i)==n){
            answer=1;
            break;
        }
    }
    return answer;
}