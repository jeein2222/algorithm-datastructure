package codingTest.ndb.greedy_imple;

import java.util.Arrays;
import java.util.Scanner;

/*
    잃어버린 괄호
    세준이는 양수와 +,-, 괄호를 가지고 식을 만든다. 이때 괄호가 모두 지워졌을 때
    다시 괄호를 쳐서 이 식의 값을 최소로 만들려고 한다.
    이렇게 만들수 있는 최솟값을 구하라.

    55+50-40
 */
public class Bj03 {
    public int solution(String str){
        String[] s=str.split("[-|+]");
        String[] pm=str.split("[0~9]");
        int answer=Integer.parseInt(s[0]);
        int plus=0;
        boolean isMinus=false;
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(pm));
        for(int i=1;i<s.length-1;i++){
            if(s[i].equals("-")){
                isMinus=true;
            }else{
                plus+=Integer.parseInt(s[i+1]);
            }
        }
        if(isMinus){
            answer=answer-plus;
        }else{
            answer=answer+plus;
        }
        return answer;
    }

    public static void main(String[] args) {
        Bj03 b = new Bj03();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(b.solution(str));

    }
}
