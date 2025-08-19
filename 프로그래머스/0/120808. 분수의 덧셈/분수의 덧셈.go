func solution(numer1 int, denom1 int, numer2 int, denom2 int) []int {
   
      numerator := numer1*denom2 + numer2*denom1
    denominator := denom1 * denom2

    
    g := gcd(numerator, denominator)
    numerator =numerator/g
    denominator = denominator/g

    return []int{numerator, denominator}
}

func gcd(a, b int) int {
    for b != 0 {
        a, b = b, a%b
    }
    return a
}