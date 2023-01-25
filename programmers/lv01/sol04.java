package codingTest.programmers.lv01;

//문자열 나누기

class Solution04 {
    public int solution(String s) {
        char first = s.charAt(0);//기준 문자
        int firstNum = 0;
        int diff = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {//기준 문자의 개수와 아닌 문자의 개수가 같을 경우
                result++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first)//기준 문자와 같으면
                firstNum++;
            else
                diff++;
            System.out.println("result:"+result+" firstNum:"+firstNum+" diff:"+diff+" first:"+first);
        }
        return result;
    }
}

//i=0 result=1 firstNum=1 diff=0 first=a
//i=1 result=1 firstNum=1 diff=1 first=a
//i=2 result=2 firstNum=2 diff=1 first=r
//i=3 result=2 firstNum=2 diff=2 first=r
//i=4 result=3 firstNum=3 diff=2 first=c


public class sol04 {
    public static void main(String[] args) {
        Solution04 s = new Solution04();
        // System.out.println(s.solution("banana"));
        // System.out.println(s.solution("abracadabra"));
        System.out.println(s.solution("aaabbaccccabba"));//
        
    }
    
}
