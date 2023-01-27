package codingTest.programmers.lv01;

import java.util.Arrays;

/*
 * 사과 1~k점
 * 한 상자에 m개씩 포장
 * 가장 낮은 점수 p일 경우, 한 상자 가격 p*m
 * 
 */
class Solution09 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //오름차순 정렬
        Arrays.sort(score);

        //내림차순으로 바꾸기
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }
        
        int min = score[0];
        int count = score.length / m;

        for (int i = 0; i < count*m; i+=m) {
            for (int j = i; j < i + m; j++) {
                if (min > score[j])
                    min = score[j];
            }
            answer += min * m;
        }
       

        return answer;
    }
}

public class sol09 {
    public static void main(String[] args) {
        Solution09 s = new Solution09();
        System.out.println(s.solution(3, 4, new int[] {1,2,3,1,2,3,1}));
        System.out.println(s.solution(4, 3, new int[] { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 }));
        
    }

}
