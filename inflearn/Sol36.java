package codingTest.inflearn;

import java.util.Scanner;
import java.util.Stack;

/*
    올바른 괄호 문제
 */
public class Sol36 {
    public boolean solution1(String str){
        boolean answer=true;
        Stack<Character> st = new Stack<>();
        for(char c: str.toCharArray()){
            if(c=='(') st.add(c);
            if(c==')') {
                if(st.size()>0)
                    st.pop();
                else{
                    answer=false;
                    break;
                }
            }
        }
        if(st.size()>0) answer=false;

        return answer;
    }
    public static void main(String[] args) {
        Sol36 s = new Sol36();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(s.solution1(str)) System.out.println("YES");
        else System.out.println("NO");
    }

}
