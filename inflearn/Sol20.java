package codingTest.inflearn;

import java.util.Arrays;
import java.util.Scanner;

//등수 구하기
/*
    95 92 92 90 90
    5  1  1  2  2
 */
public class Sol20 {
    public int[] solution(int n, int[] arr){
        int[] answer=new int[n];
        for(int i=0;i<n;i++){
            int cnt=1;
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    cnt++;
                }
            }
            answer[i]=cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Sol20 s = new Sol20();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        for(int a: s.solution(n, arr)){
            System.out.print(a+" ");
        };
    }
}
