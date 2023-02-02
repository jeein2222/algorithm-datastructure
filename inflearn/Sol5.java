package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

//특정 문자 뒤집기
public class Sol5 {

    //정답
    public String solution2(String s){
        char[] arr=s.toCharArray();
        int lt=0,rt=arr.length-1;
        while(lt<rt){
            if(!Character.isAlphabetic(arr[lt])) lt++;//lt가 특수문자일때
            else if(!Character.isAlphabetic(arr[rt])) rt--;//lt는 알파벳이고 rt가 특수문자일때
            else{//lt와 rt 모두 알파벳일 때
                char tmp=arr[lt];
                arr[lt]=arr[rt];
                arr[rt]=tmp;
                lt++;
                rt--;
            }

        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Sol5 s = new Sol5();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        System.out.println(s.solution2(str));

    }
}
