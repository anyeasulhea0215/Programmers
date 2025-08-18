func solution(n int) int {
    answer := 2
    
    for num :=1; n>=num*num; num++ {
        if n == num*num {
            answer=1
            break
        }
    }
    return answer
}

