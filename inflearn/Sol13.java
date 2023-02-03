package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

//큰 수 출력하기
public class Sol13 {
    public ArrayList<Integer> solution1(int n, int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol13 s=new Sol13();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        for(int x:s.solution1(n,arr)){
            System.out.print(x+" ");
        };

    }
}
