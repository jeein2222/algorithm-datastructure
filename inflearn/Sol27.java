package codingTest.inflearn;

import java.util.Scanner;

/*
    최대 매출
    10 3
    12 15 11 20 25 10 20 19 13 15
 */
public class Sol27 {
    //시간 초과
    public int solution1(int n, int k, int[] arr){
        int max=0;
        for(int i=0;i<n && i+k<n;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>max)
                max=sum;
        }

        return max;
    }
    //sliding window
    public int solution2(int n, int k, int[] arr){
        int answer=0,sum=0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        answer=sum;
        for(int i=k;i<n;i++){
            sum+=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol27 s=new Sol27();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(s.solution2(n,k,arr));
    }
}
