package codingTest.inflearn;

import java.util.Scanner;

//연속부분수열
public class Sol28 {
    //mine
    public int solution1(int n, int m, int[] arr){
        int answer=0;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            int j=i+1;
            while(sum<=m&&j<n){
                sum+=arr[j];
                if(sum==m){
                    answer++;
                    break;
                }
                j++;
            }
        }

        return answer;
    }

    //answer
    public int solution2(int n, int m, int[] arr){
        int answer=0,sum=0,lt=0;
        for(int rt=0;rt<n;rt++){
            sum += arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sol28 s=new Sol28();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(s.solution2(n,m,arr));
    }
}
