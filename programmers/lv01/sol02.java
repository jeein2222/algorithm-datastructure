package codingTest.programmers.lv01;


//크기가 작은 부분문자열
class Solution02 {
    public int solution(String t, String p) {
        int len = p.length();
        long num = 0;
        int count = 0;
        for (int i = 0; i <= t.length()-len; i++) {
            num = Long.parseLong(t.substring(i, i + len));
            if (num <=  Long.parseLong(p)) {
                count++;
            }
        }
        return count;
    }
}

public class sol02 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        System.out.println(s.solution("3141592",	"271"));
    }
}
