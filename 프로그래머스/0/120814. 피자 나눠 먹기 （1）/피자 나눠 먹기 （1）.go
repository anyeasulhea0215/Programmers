func solution(n int) int {

    var m int
    m=n/7
    
    if n%7 >0 {
     m=m+1   
    }
    
    return m
}
