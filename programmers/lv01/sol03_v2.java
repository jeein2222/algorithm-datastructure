package codingTest.programmers.lv01;

import java.util.HashMap;
import java.util.Arrays;

class Solution03_v2 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
                map.put(s.charAt(i), i);
            } else {
                int before = map.get(s.charAt(i));
                answer[i] = i - before;
                map.put(s.charAt(i), i);
            }
        }

        return answer;
    }
}

public class sol03_v2 {
     public static void main(String[] args) {
        Solution03_v2 s = new Solution03_v2();
        System.out.println(Arrays.toString(s.solution("banana")));
        System.out.println(Arrays.toString(s.solution("footbar")));
     }
    
}
