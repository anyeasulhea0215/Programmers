function solution(n) {
    var answer = 0;
    let mul=1;
    for(let i=1;i<=n;i++){
        mul=mul*i;
        if(mul>n){
            break;
          
        }
          answer=i;
    }
    return answer;
}