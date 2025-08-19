func solution(money int) []int {
 
    
     count := money / 5500
    reminder := money % 5500    
    
    return []int{count, reminder}
}