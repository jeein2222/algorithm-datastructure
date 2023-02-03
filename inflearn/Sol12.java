package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//암호
public class Sol12 {
    //mine
    public String solution1(int n, String s){
        String answer="";
        int tmp=0;
        //n개의 말뭉치로 나눈다.
        String[] arr=new String[n];
        int cnt=0;
        for(int i=0;i<=s.length()-7;i+=7){
            arr[cnt]=s.substring(i,i+7);
            cnt++;
        }

        int result=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<7;j++){
                if(arr[i].charAt(j)=='#') result+=Math.pow(2,6-j);
            }
            answer+=(char)result+"";
            result=0;
        }

        return answer;
    }

    //answer
    public String solution2(int n,String s){
        String answer="";
        for(int i=0;i<n;i++){
            String tmp=s.substring(0,7).replace('#','1').replace('*','0');
            //이진수를 정수로
            int num=Integer.parseInt(tmp,2);
            answer+=(char)num;
//            System.out.println(tmp+" "+num+" "+answer);
            s=s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sol12 s=new Sol12();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str = sc.next();

        System.out.println(s.solution1(n,str));
        System.out.println(s.solution2(n,str));
    }
}
