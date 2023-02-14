package codingTest.inflearn;

import java.util.Scanner;

//연속된 자연수의 합
/*
    15 = 7+8 = 4+5+6 = 1+2+3+4+5
 */
public class Sol29 {
    public int solution1(int n){
        int answer=0,sum=0,lt=0;
        int m=n/2+1;
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;

        for(int rt=0;rt<m;rt++){
            sum+=arr[rt];
            if(sum==n) answer++;
            while(sum>=n){
                sum-=arr[lt++];
                if(sum==n) answer++;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol29 s = new Sol29();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.solution1(n));
    }
}
