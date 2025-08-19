func solution(array []int, n int) int {
    
    num := len(array)
    count :=0
    
    for i :=0; i<num ; i++ {
        if(array[i] == n) {
            count ++
        }    
    }
    return count
}