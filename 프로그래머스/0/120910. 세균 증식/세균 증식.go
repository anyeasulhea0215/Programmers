func solution(n int, t int) int {
    answer :=1 
    for i :=1; i< t+1; i++ {
        n=n*2
    }
    answer=n
    return answer
}

