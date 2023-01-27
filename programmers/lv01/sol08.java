package codingTest.programmers.lv01;


//기사 단원의 무기
/*
 * 기사번호의 약수 개수 = 공격력 무기
 * 공격력의 제한 수치 보다 크면 정해진 수치로 교체
 */
class Solution08 {

    //약수의 개수 구하는 함수 -> 제곱근까지만 count
    public int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n)
                count++;
            else if (n % i == 0)
                count += 2;
        }
        return count;
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] powers = new int[number];

        for (int i = 1; i <= powers.length; i++) {
            powers[i - 1] = countDivisors(i);
            if (powers[i - 1] > limit)
                powers[i - 1] = power;
            answer += powers[i - 1];
        }
        
        return answer;
    }
}

public class sol08 {

    public static void main(String[] args) {
        Solution08 s = new Solution08();
        System.out.println(s.solution(5, 3, 2));
        System.out.println(s.solution(10,3,2));
        
    }
    
}
