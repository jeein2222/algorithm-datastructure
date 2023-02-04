package codingTest.ndb.greedy_imple;

import java.util.Scanner;

/*
    1이 될 때까지
    N=1이 될 때까지 두 과정 중 하나를 반복하여 선택.
    - N에서 1빼기
    - N을 K로 나누기
    N=17 K=4 17-1=16 16/4=4 4/4=1 최소 3회만에 1이 된다.
    N=20 K=4 20/4=5 5-1=4 4/4=1 3회
    N=25 K=3 25-1=24 24/3=8 8-1=7 7-1=6 6/3=2 2-1=1 6회
    N=25 K=4 25-1=24 24/4=6 6-1=5 5-1=4 4/4=1 5회
 */
public class Sol04 {

    public int solution1(int n, int k){
        int cnt=0;
        while(true){
            int target=(n/k)*k;
            //N이 K로 나눠 떨어지는 수가 될 때까지만 1씩 빼기
            cnt+=n-target;
            n=target;
            //더이상 나눌 수 없을 때 반복문 탈출
            if(n<k) break;
            cnt+=1;
            n/=k;
        }

        //마지막으로 남은 수에 대하여 1씩 빼기
        cnt+=(n-1);
        return cnt;
    }

    public static void main(String[] args) {
        Sol04 s=new Sol04();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        System.out.println(s.solution1(n,k));

    }
}
