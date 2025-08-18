func solution(slice int, n int) int {
    var answer int =0
    
    answer=n/slice
    
    if n%slice > 0 {
        answer+=1        
    }
    return answer
}

