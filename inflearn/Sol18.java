package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

//뒤집은 소수
public class Sol18 {
    public ArrayList<Integer> solution(int n, String[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb;
        int[] numbers=new int[n];
        for(int i=0;i<arr.length;i++){
            sb=new StringBuilder(arr[i]);
            numbers[i]=Integer.parseInt(sb.reverse().toString());
        }


        for(int i=0;i<numbers.length;i++){
            int cnt=0;
            for(int j=1;j<=numbers[i];j++){
                if(numbers[i]%j==0)
                    cnt++;
            }
            if(cnt==2)
                answer.add(numbers[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        Sol18 s=new Sol18();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int a:s.solution(n,arr)){
            System.out.print(a+" ");
        }

    }
}
