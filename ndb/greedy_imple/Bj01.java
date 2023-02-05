package codingTest.ndb.greedy_imple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//회의실 배정
/*
    회의실 배정
    한 개의 회의실 -> 이를 사용하고자 하는 N개의 회의
    각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수

    0 1 2 3 4 5 6 7 8 9
    ----
       ----
           ----
              -----
          -----------
              ----------
 */
public class Bj01 {

    public int solution(int n, int[][] arr){
        int answer=1;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //1번째 위치 기준 오름차순
                if(o1[1]==o2[1]){//종료 시간이 같으면 시작시간이 빠른 순
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
        //


        int p=0;
        for(int i=1;i<n;i++){
            if(arr[p][1]<=arr[i][0]){
                answer++;
                p=i;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Bj01 b=new Bj01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(b.solution(n,arr));
    }
}
