package codingTest.inflearn;

import java.util.Scanner;

/*
    격자판 최대합 행,열,대각선(00 11 22, 02,11,20)
    1 2 3
    2 2 2
    3 3 1
 */
public class Sol21 {

    public int solution(int n, int[][] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        //각 행
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            if(max<sum){
                max=sum;
            }
        }

        //각열
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j][i];
            }
            if(max<sum){
                max=sum;
            }
        }


        //대각선1
        sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
        }
        max=Math.max(sum,max);


        //대각선2
        sum=0;
        for(int i=0;i<n;i++){
                sum+=arr[i][n-i-1];
        }
        max=Math.max(sum,max);

        return max;
    }

    public static void main(String[] args) {
        Sol21 s = new Sol21();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.println(s.solution(n,arr));
    }
}
