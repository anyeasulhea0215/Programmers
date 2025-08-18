func solution(hp int) int {
    
    var  answer int = 0

    // 5로 나눈 몫
    answer += hp / 5
    hp = hp % 5

    // 3으로 나눈 몫
    answer += hp / 3
    hp = hp % 3

    // 1로 나눈 몫
    answer += hp / 1

    return answer
}

