function solution(n) {
   
    let m=1;
    for(let i=1;i<=n;i++){
         m=i*6; //피자 판수에 따른 조각 개수
        if(m%n==0){
         return i;
          
        }
         
    }
  
}