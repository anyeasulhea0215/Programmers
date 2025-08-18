func solution(n int) int {
    m := 1
    for i := 1; i<=n; i++ {
        m=i*6
        if m%n ==0 {
            return i
        }
    }
  return -1
}

