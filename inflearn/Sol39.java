package codingTest.inflearn;

import java.util.Scanner;
import java.util.Stack;

//후위식 연산
public class Sol39 {
    public int solution1(String str) {
        Stack<Integer> st = new Stack<>();
        for (char c : str.toCharArray()) {
             if('0'<=c && c<='9') {//Character.isDigit(c)
                st.push(c-'0');
            }
            else{
                int a=st.pop();
                int b=st.pop();
                if(c=='+') st.push(a+b);
                if(c=='-') st.push(b-a);
                if(c=='*') st.push(a*b);
                if(c=='/') st.push(b/a);

            }
        }


        return st.pop();
    }
    public static void main(String[] args) {
        Sol39 s = new Sol39();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(s.solution1(str));
    }
}
