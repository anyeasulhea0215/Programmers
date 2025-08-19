func solution(numbers []int) int {
    
    max := numbers[0] * numbers[1]
    num := len(numbers)

    for i := 0; i < num; i++ {
        for j := i + 1; j < num; j++ {
            product := numbers[i] * numbers[j]
            if product > max {
                max = product
            }
        }
    }

    return max
}