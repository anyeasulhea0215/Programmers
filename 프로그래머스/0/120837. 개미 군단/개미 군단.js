function solution(hp) {
    var answer = 0;
     if(hp%5<5){
         answer+=~~(hp/5); //ans=4
         hp=hp%5;  //hp=3
         if(hp%3<3){   
             answer+=~~(hp/3);
             hp=hp%3;  
             if(hp%1<1){
                 answer+=~~(hp/1);
             }
         }
     }
    return answer;
}