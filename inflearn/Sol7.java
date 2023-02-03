package codingTest.inflearn;

import java.util.Scanner;

//회문 문자열 -> lr, rt
public class Sol7 {
    public void solution1(String s) {
        String answer="YES";
        s=s.toUpperCase();
        char[] arr = s.toCharArray();
        int lt=0, rt=arr.length-1;
        while(lt<rt){
            if(arr[lt]!=arr[rt]){
                answer="NO";
                break;
            }
            lt++;
            rt--;
        }
        System.out.println(answer);
    }

    public void solution2(String s){
        String answer = "NO";
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(tmp)) {
            answer="YES";
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Sol7 s=new Sol7();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        s.solution1(str);
        s.solution2(str);
    }
}
