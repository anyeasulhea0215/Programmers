func solution(numbers []int, direction string) []int {
    
    len := len(numbers)
    
      if direction == "right" {       
        lastElement := numbers[len-1] 
        numbers = append([]int{lastElement}, numbers[0:len-1]...) 
    } else { 
      firstElement := numbers[0] 
          numbers = append(numbers[1:len], firstElement )
    }
    return  numbers
}