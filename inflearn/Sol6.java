package codingTest.inflearn;

import java.util.Scanner;

//중복문자제거
public class Sol6 {
    //ksekkset -> kset

    public String solution(String s){
        String answer="";
        for(int i=0;i<s.length();i++){
            if(i==s.indexOf(s.charAt(i))){//현재 위치와 처음 발견된 위치가 같을 경우
                answer+=s.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Sol6 s=new Sol6();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        System.out.println(s.solution(str));

    }
}
