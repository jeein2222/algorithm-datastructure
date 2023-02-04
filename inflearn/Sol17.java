package codingTest.inflearn;

import java.util.Scanner;

//소수(에라토스테네스 체)
/*
    1~n까지 소수의 갯수
    2 3 5 7 11 13 17

        0 1 2 3 4 5 6 7 ...20
i=2~20      1 1 1   1       1
 */
public class Sol17 {
    public int solution(int n){
        int answer = 0;
        int[] arr=new int[n+1];
        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                answer++;
                for(int j=i+i;j<=n;j+=i){
                    arr[j]=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol17 s=new Sol17();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(s.solution(n));

    }
}
