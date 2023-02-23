package codingTest.inflearn;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
    K번째 큰 수
    3 15 34 23 45 65 33 11 26 42

 */
public class Sol35 {
    public int solution1(int n, int k, int[] arr){
        //내림차순으로
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int m=j+1;m<n;m++){
                    set.add(arr[i] + arr[j] + arr[m]);
                }
            }
        }

        int cnt=0;
        for(int x: set){
            cnt++;
            if(cnt==k){
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Sol35 s = new Sol35();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(s.solution1(n,k,arr));
    }
}
