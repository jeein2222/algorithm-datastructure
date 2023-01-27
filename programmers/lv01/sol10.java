package codingTest.programmers.lv01;

//푸드 파이트 대회

class Solution10 {
    public String solution1(int[] food) {//내 풀이
        String answer = "0";

        for (int i = 1; i < food.length; i++) {
            if (food[i] < 2)
                food[i] = 0;
            else {
                food[i] = food[i] / 2;
            }
        }

        for (int i = food.length - 1; i >= 1; i--) {
            for (int j = 0; j < food[i]; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
    
    public String solution2(int[] food) {//다른 사람 풀이
        String answer = "0";

        for (int i = food.length - 1; i >= 1; i--) {
            for(int j=0;j<food[i]/2;j++)
                answer = i + answer + i;
        }

        return answer;

    }
}

public class sol10 {
    public static void main(String[] args) {
        Solution10 s = new Solution10();

        System.out.println(s.solution1(new int[] { 1, 3, 4, 6 }));// 1223330333221
        System.out.println(s.solution2(new int[] { 1, 3, 4, 6 }));// 1223330333221
    }
}
