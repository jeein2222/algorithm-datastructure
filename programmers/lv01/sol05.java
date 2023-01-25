package codingTest.programmers.lv01;


//콜라 문제
/*
 * 빈병 a개를 가져다 주면 콜라 b병을 주는 마트
 * 빈병 n개를 가져다주면 몇 병을 받을 수 있는지
 * 
 * ex.
 * 빈병 2개 -> 1병
 * 빈병 20개 -> 20/2=10 10/2=5 5/2=2 1+2/2=1 1+1/2=1
 
 * 
 * 빈병 4개 -> 2병
 * 빈병 20개 -> 20/4=5 5*2/4=2 2*2+2/4=1 1*2+2/4=1
 *             5*2    2*2      1*2       1*2
 * 
 */

class Solution05 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int num=n;
        
        while (true) {
            if (num < a) {
                break;
            }
            
            answer=answer+(num/a)*b;
            num = (num/a) * b + (num % a);
            
            System.out.println(answer + " " + num);
           
        }
        
        return answer;
    }
}

public class sol05 {
    public static void main(String[] args) {
        Solution05 s = new Solution05();
        System.out.println(s.solution(2, 1, 20));
        System.out.println(s.solution(3, 1, 20));
        System.out.println(s.solution(4, 2, 20));


    }
    
}
