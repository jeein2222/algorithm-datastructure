package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    공통원소 구하기
    1 2 3 5 9
    2 3 5 7 8
 */
public class Sol26 {
    public ArrayList<Integer> solution(int n, int[] a, int m, int[] b){
        int p1=0,p2=0;
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) {
                p1++;
            }else if(a[p1]>b[p2]){
                p2++;
            }else{
                answer.add(a[p1++]);
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol26 s = new Sol26();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for(int i:s.solution(n,a,m,b)){
            System.out.print(i+" ");
        }
    }
}
