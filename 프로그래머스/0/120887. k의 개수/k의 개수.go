func solution(i int, j int, k int) int {
    
     count := 0

    for num := i; num <= j; num++ {
        n := num
       
        for n > 0 {
            if n%10 == k {
                count++
            }
            n /= 10
        }
    }

    return count
}