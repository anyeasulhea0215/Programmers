func combination(n int, k int) int {
    result := 1
    for i := 0; i < k; i++ {
        result *= (n - i)
        result /= (i + 1)
    }
    return result
}


func solution(balls int, share int) int {
    return combination(balls, share)
}