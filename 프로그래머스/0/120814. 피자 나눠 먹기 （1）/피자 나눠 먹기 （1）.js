function solution(n) {
    var answer = 0;
    let m=~~(n/7);
    if(n%7>0){
        m=m+1;
    }
    answer=m;
    return answer;
}