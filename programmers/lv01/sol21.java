package codingTest.programmers.lv01;

import java.util.Scanner;

/*
    음양 더하기
 */
public class sol21 {
    public int solution(int[] absolutes, boolean[] signs){
        int answer=0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return answer;
    }
    public static void main(String[] args) {
        sol21 s = new sol21();
        System.out.println(s.solution(new int[] {7,8,9},new boolean[] {true,false,true}));
    }
}
