function solution(balls, share) {
    var answer = 0;
    answer=combination(balls,share);
    return answer;
}

function combination( n, k){
    let result=1;
    
      for(let i=0;i<k;i++){
            result*=(n-i);
            result/=(i+1);
        }
    return result;
}