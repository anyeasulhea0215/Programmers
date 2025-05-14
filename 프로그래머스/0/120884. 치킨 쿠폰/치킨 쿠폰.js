function solution(chicken) {
    var answer = 0;
    let lesschik=0;
    
      let m=0  //받은 쿠폰으로 먹을수 있는 치킨 개수 ex)1081/10=108 freechicken
      
    while(chicken>=10){
          m=~~(chicken/10);
        
          lesschick=chicken%10;
          answer=answer+m;   //answer에 서비스로 먹는 치킨 추가->108
          chicken=lesschick+m;
    }
    
    return answer;
}