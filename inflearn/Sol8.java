package codingTest.inflearn;

import java.util.Scanner;

//유효한 팰린드롬
public class Sol8 {
    public String solution(String str){
        String answer="NO";
        //A-Z가 아닌 것은 모두 제거
        str=str.toUpperCase().replaceAll("[^A-Z]","");
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Sol8 s=new Sol8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(s.solution(str));
    }
}
