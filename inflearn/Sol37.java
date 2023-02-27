package codingTest.inflearn;

import java.util.Scanner;
import java.util.Stack;

//괄호문자제거
public class Sol37 {
    public String solution1(String str){
        String result="";
        Stack<Character> st = new Stack<>();
        for(char c:str.toCharArray()){
            if(c==')'){
                while(st.pop()!='(');
            }else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            char c=st.pop();
            if(c!='('&&c!=')')
                result=c+result;
        }

//        for(int i=0;i<st.size();i++){
//            char c=st.get(i);
//            if(c!='('&&c!=')')
//                result+=c;
//        }


        return result;
    }
    public static void main(String[] args) {
        Sol37 s = new Sol37();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution1(str));

    }
}
