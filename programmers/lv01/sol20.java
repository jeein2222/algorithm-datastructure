package codingTest.programmers.lv01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    숫자 문자열과 영단어
 */
public class sol20 {
    public int solution1(String s){
        ArrayList<String> list=new ArrayList<>(Arrays.asList("zero","one","two","three",
                "four","five","six","seven","eight","nine"));
        String result="";
        String str="";

        for(char c:s.toCharArray()){
            System.out.println("c:"+c);
            if(Character.isDigit(c)) result=result+c;
            else{
                str+=c;
                if(list.contains(str)){
                    result+=""+list.indexOf(str);
                    str="";
                }
            }
        }

        return Integer.parseInt(result);
    }
    public int solution2(String s){
        int answer=0;
        int len = s.length();
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for(int i=0;i<10;i++){
            s=s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        sol20 s = new sol20();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution1(str));
        System.out.println(s.solution2(str));
    }

}
