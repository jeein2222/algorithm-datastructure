package codingTest.inflearn;

import java.util.Scanner;

//점수 계산
public class Sol19 {

    //mine
    public int solution1(int n, int[] arr){
        int answer=0;
        int cnt=1;
        for(int i=0;i<arr.length;i++){
            if(i==0) answer+=arr[i];
            else if(arr[i-1]==arr[i]&&arr[i]==1){
                cnt++;
                answer+=cnt;
            }else{
                answer+=arr[i];
                cnt=1;
            }
//            System.out.print(i+":"+answer+" ");

        }

        return answer;
    }

    //answer -> 1만 계산하면 되므로
    public int solution2(int n, int [] arr){
        int answer=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) {
                cnt=0;
            }else{
                cnt++;
                answer+=cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol19 s=new Sol19();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(s.solution1(n,arr));
        System.out.println(s.solution2(n,arr));



    }
}
