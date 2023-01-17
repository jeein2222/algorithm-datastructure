package codingTest.programmers.lv01;

import java.util.Arrays;

//가장 가까운 같은 글자
class Solution03 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] sList = s.split("");
        int index = 0;
        String str;
        for (int i = 0; i < sList.length; i++) {
            if (i == 0) {
                answer[i] = -1;
            } else {
                str = s.substring(0, i);
                index=str.lastIndexOf(sList[i]);
                if(index!=-1){
                    answer[i]=i-index;
                }else{
                    answer[i]=index;
                }
            }
        }
        return answer;
    }
}

public class sol03 {
    public static void main(String[] args) {
        Solution03 s = new Solution03();
        System.out.println(Arrays.toString(s.solution("banana")));
        System.out.println(Arrays.toString(s.solution("footbar")));

    }
    
}
