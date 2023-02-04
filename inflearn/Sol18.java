package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

//뒤집은 소수
public class Sol18 {
    //mine
    public ArrayList<Integer> solution1(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb;
        int[] numbers=new int[n];
        for(int i=0;i<arr.length;i++){
            String s=Integer.toString(arr[i]);
            sb=new StringBuilder(s);
            numbers[i]=Integer.parseInt(sb.reverse().toString());
            if(isPrime(numbers[i])) answer.add(numbers[i]);
        }


        return answer;
    }
    //answer
    public boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution2(int n, int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp=arr[i];
            int res=0;
            while(tmp>0){
                int t=tmp%10;
                res=res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
    public static void main(String[] args) {
        Sol18 s=new Sol18();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:s.solution1(n,arr)){
            System.out.print(a+" ");
        }

        System.out.println();

        for(int b:s.solution2(n,arr)){
            System.out.print(b+" ");
        }

    }
}
