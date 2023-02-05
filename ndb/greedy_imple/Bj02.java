package codingTest.ndb.greedy_imple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//보물
/*
    옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
    길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
    S = A[0] × B[0] + ... + A[N-1] × B[N-1]
    S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
    S의 최솟값을 출력하는 프로그램을 작성하시오.
 */
public class Bj02 {
    /*
        Wrapper클래스를 사용하면 Arrays.sort(arr,Comparator.reverseOrder()) 사용 가능하다
        Integer[] arr=new Integer[N];
     */
    public int solution(int n, int[] A, int[] B){
        int answer=0;
        Arrays.sort(A);

        int index=0;
        for(int t=0;t<n;t++){
            int max=0;
            for(int i=0;i<n;i++){
                if(max<B[i]){
                    max=B[i];
                    index=i;
                }
            }
            B[index]=0;
            answer+=A[t]*max;
        }

        return answer;
    }

    public static void main(String[] args) {
        Bj02 b=new Bj02();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i] = sc.nextInt();
        }

        System.out.println(b.solution(n,A,B));



    }
}
