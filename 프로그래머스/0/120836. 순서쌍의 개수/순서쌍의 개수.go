func solution(n int) int {
    answer := 0
    for a:=1; a<= n ; a++ {
        if n%a == 0 {
            answer++
        }
    }
    return answer
}


