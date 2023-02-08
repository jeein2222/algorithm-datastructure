package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    두 배열 합치기 -> two pointer 문제
 */
public class Sol25 {
    //별로..
    public int[] solution1(int n, int[] arr1, int m,int[] arr2){
        int[] newArr=new int[n+m];
        for(int i=0;i<newArr.length;i++){
            if(i<n) newArr[i]=arr1[i];
            else newArr[i]=arr2[i-n];
        }
        Arrays.sort(newArr);
        return newArr;
    }
    //two pointers
    public ArrayList<Integer> solution2(int n, int[]arr1, int m, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int p1=0,p2=0;
        while(p1<n && p2<m){
            if(arr1[p1]<arr2[p2]) list.add(arr1[p1++]);
            else list.add(arr2[p2++]);
        }
        while(p1<n){//p1이 남으면
            list.add(arr1[p1++]);
        }
        while(p2<m){//p2가 남으면
            list.add(arr2[p2++]);
        }
        return list;
    }

    public static void main(String[] args) {
        Sol25 s=new Sol25();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i:s.solution2(n,arr1,m,arr2))
            System.out.print(i+" ");
    }
}
