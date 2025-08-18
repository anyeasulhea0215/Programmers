func solution(n int) int {
    answer := 0
    mul := 1
    
    for i := 1; i<= n; i++ {
        mul*=i
        if mul > n {
            break
        }
        answer=i
    }
    return answer
}

