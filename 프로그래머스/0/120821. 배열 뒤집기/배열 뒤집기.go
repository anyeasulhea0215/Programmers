func solution(num_list []int) []int {
     n := len(num_list)
    arr := make([]int, n)

    for i := 0; i < n; i++ {
        arr[i] = num_list[n-1-i]
    }
    return arr
}