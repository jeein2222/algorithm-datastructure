package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//단어 뒤집기
public class Sol4 {

    public void solution1(int n, String[] str){
        for(int i=0;i<n;i++){
            String[] s = str[i].split("");
            for(int j=s.length-1;j>=0;j--)
                System.out.print(s[j]);
            System.out.println();
        }
    }

    public void solution2(int n, String[] str){
        String reversed="";
        for(int i=0;i<n;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                reversed += str[i].charAt(j);
            }
            System.out.println(reversed);
            reversed="";
        }
    }

    public void solution3(int n, String[] str){
        StringBuffer sb=new StringBuffer();
        for(String s:str){
            sb.append(s);
            System.out.println(sb.reverse());
            sb.delete(0,s.length());
        }

    }

    public void solution4(int n, String[] str){
        for(String x:str){
            char[] s=x.toCharArray();
//            for(int i=0;i<=s.length/2-1;i++){
//                char tmp=s[i];
//                s[i]=s[s.length-i-1];
//                s[s.length-i-1]=tmp;
//            }
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            System.out.println(String.valueOf(s));
        }
    }

    public static void main(String[] args) {
        Sol4 s=new Sol4();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        s.solution4(n,str);
    }


}
