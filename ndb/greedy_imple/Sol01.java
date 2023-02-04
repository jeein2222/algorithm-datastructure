package codingTest.ndb.greedy_imple;


import java.util.Arrays;
import java.util.Scanner;

/*
    큰 수의 법칙
    2 4 5 4 6 배열이 있을 때 M=8, K=3 이면 3번까지 연속해서 더하여 만들 수 있는 가장 큰 수는
    6+6+6+5+6+6+6+5+=46이 된다.
    서로 다른 인덱스에 해당하는 수가 같은 경우에도 서로 다른 것으로 간주.
    3 4 3 4 3 배열, M=7, K=2 -> 4+4+4+4+4+4+4=28
 */

public class Sol01 {

    public int solution(int n, int m, int k, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int f=arr[n-1];//5
        int s=arr[n-2];//4

        //5+5+5+4+5+5+5+4+5+5
        int cnt=(m/(k+1))*k+(m%(k+1));//큰 수 더하는 횟수
        answer+=cnt*f+(m-cnt)*s;

        return answer;
    }

    public static void main(String[] args) {
        Sol01 s=new Sol01();
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(s.solution(n,m,k,arr));


    }
}
