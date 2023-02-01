package codingTest.inflearn;

import java.util.Scanner;

//문자 찾기(대소문자 구분 없이)
public class Sol1 {

    public int solution(String str, char c) {
        int count=0;
        str=str.toUpperCase();
        c=Character.toUpperCase(c);
//        for(int i=0;i<str.length();i++)
//            if(str.charAt(i)==c)
//                count++;

        for(char x:str.toCharArray())
            if(x==c)
                count++;

        return count;
    }

    public static void main(String[] args) {
        Sol1 s=new Sol1();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char c=sc.next().charAt(0);

        System.out.println(s.solution(str,c));
    }
}
