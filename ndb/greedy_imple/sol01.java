package codingTest.ndb.greedy_imple;


import java.util.Arrays;
import java.util.Scanner;

//큰 수의 법칙

class Solution01{
    public int solution(int n, int m, int k, int[] arr){
        Arrays.sort(arr);//정렬
        int first=arr[n-1];//max
        int second=arr[n-2];//min

        //가장 큰 수가 더해지는 횟수 계산
        int cnt=(m/(k+1))*k;//몫
        cnt+=m%(k+1);//나머지

        int result=0;
        result+=cnt*first;//가장 큰 수 더하기
        result+=(m-cnt)*second;// 두번째로 큰 수 더하기

        return result;
    }
}

public class sol01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        //오름차순 정렬
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 4, 4, 5, 6]
        int count=0;

        //m이 100억 이상일 경우 시간 초과
        for(int i=0;i<m;i++){
            if(count<k){
                sum+=arr[n-1];
                System.out.println(sum);
                count++;
            }else{
                sum+=arr[n-2];
                count=0;
            }
        }

        System.out.println(sum);
    }
}
