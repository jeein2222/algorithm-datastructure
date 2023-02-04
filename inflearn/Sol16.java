package codingTest.inflearn;

import java.util.Arrays;
import java.util.Scanner;

//피보나치 수열 -> retry
public class Sol16 {
    public int[] solution1(int n){
        int[] answer = new int[n];
        answer[0]=1; answer[1]=1;
        for(int i=2;i<answer.length;i++){
            answer[i]=answer[i-1]+answer[i-2];
        }
        return answer;
    }

    public void solution2(int n){
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }

    //배열을 사용하지 않는 방법
    public void solution3(int n){
        int a=1,b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public int fibo(int n){
        if(n==0 || n==1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Sol16 s=new Sol16();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i:s.solution1(n)){
            System.out.print(i+" ");
        };
        System.out.println();
        s.solution2(n);
        System.out.println();
        s.solution3(n);
    }
}
