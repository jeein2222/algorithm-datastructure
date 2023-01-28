package codingTest.programmers.lv01;

import java.util.Arrays;
import java.util.Stack;



class Solution11{
    //시간초과
    public int solution1(int[] ingredient) {
        int answer = 0;
        String s = Arrays.toString(ingredient).replaceAll("\\[|]|,| ", "");
        for (int i = 0; i <= s.length() / 4; i++) {
            if (s.contains("1231")) {
                answer += 1;
                s = s.replace("1231", "");
            }
        }
        return answer;
    }
    //Stack 이용
    public int solution2(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int in : ingredient) {
            stack.push(in);

            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 4) == 1
                        && stack.get(stack.size() - 3) == 2
                        && stack.get(stack.size() - 2) == 3
                        && stack.get(stack.size() - 1) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}

public class sol11{
    public static void main(String[] args) {
        Solution11 s=new Solution11();
        System.out.println(s.solution2(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution2(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2}));

    }
}