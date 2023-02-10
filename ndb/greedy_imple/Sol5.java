package codingTest.inflearn.greedy_imple;

import java.util.Scanner;

/*
    곱하기 혹은 더하기
    각 자리가 숫자(0~9)로만 이루어진 문자열 S가 주어졌을 때 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자
    사이에 x,+를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하세요.(모든 연산은 왼쪽 -> 오른쪽으로)
    02984 (0+2)*9*8*4=576
 */
public class Sol5 {
    public int solution(String s){
        int answer=0;
        for(int i=0;i<s.length();i++){
            //char->int
            int n = s.charAt(i)-'0';//Character.getNumericValue(s.charAt(i))
            if(n<=1||answer<=1){
                answer+=n;
            }else{
                answer*=n;

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Sol5 s = new Sol5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
