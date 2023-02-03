package codingTest.inflearn;

import java.util.Arrays;
import java.util.Scanner;

//피보나치 수열 -> retry
public class Sol16 {
    public int[] d;
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

    //메모이제이션
    public void solution4(int n){
        d=new int[n];
        for(int a:d){
            a=0;
        }
        d[0]=1;
        d[1]=1;
        System.out.println(Arrays.toString(d));
        fibo2(n);
        System.out.println(Arrays.toString(d));
    }

    public int fibo2(int n){
        if(n==0 || n==1)
            return 1;
        if(d[n]!=0)
            return d[n];
        d[n]=fibo2(n-1)+fibo2(n-2);
        return d[n];
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
        s.solution4(n);
    }
}
