package codingTest.inflearn;

import java.util.Scanner;

/*
    합이 같은 부분집합
    N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
    두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 YES, 그렇지 않으면 NO
    둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어야
    1 3 5 6 7 10
    total=32
    D(level, Sum)
                            D(0,0)
                    D(1,1)          D(1,0)
                D(2,4) D(2,1)   D(2,3)  D(2,0)
    total-sum == sum -> yes 하고 끝냄

 */
public class Sol49 {
    static int n,total=0;
    static boolean flag=false;
    static String answer = "NO";
    public void DFS(int l,int sum,int[] arr){
        if(flag) return;
        if(sum>total/2) return;
        if(l==n){
            if(total-sum==sum){
                answer = "YES";
                flag=true;
            }
        }else{
            DFS(l + 1, sum + arr[l], arr);
            DFS(l + 1, sum , arr);
        }

    }

    public static void main(String[] args) {
        Sol49 s = new Sol49();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        s.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
