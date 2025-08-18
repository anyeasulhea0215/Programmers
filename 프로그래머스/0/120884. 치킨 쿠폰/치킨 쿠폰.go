func solution(chicken int) int {
    var answer int
    var free int
    var reminder int
    
    for chicken >= 10 {
      free=chicken/10
      reminder=chicken%10
        
        answer+=free
        chicken=reminder+free
    }
    return answer
}

