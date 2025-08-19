func solution(n int, numlist []int) []int {
     num := len(numlist)
    arr := make([]int, num) 
    idx := 0

    for i := 0; i < num; i++ {
        if numlist[i]%n == 0 {
            arr[idx] = numlist[i]
            idx++
        }
    }

    return arr[:idx]
}