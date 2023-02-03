package codingTest.inflearn;

import java.util.Scanner;

public class Sol14 {
    public int solution(int n, int[] arr){
        int answer=1;//맨 앞에 있는 학생은 항상 보이므로
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                answer++;
                max=arr[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Sol14 s=new Sol14();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println(s.solution(n,arr));
    }
}
