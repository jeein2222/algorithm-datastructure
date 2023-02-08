package codingTest.inflearn;

import java.util.Scanner;
/*
    멘토링 -> retry
    M번의 테스트 등수
    A멘토 B멘티 A등수>B등수
 */
public class Sol24 {
    public int solution(int n, int m, int[][]arr){
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    boolean bool=true;
                    for(int x=0;x<m;x++){
                        if(arr[x][i]>=arr[x][j]){
                            bool=false;
                            break;
                        }
                    }
                    if(bool==true){
                        cnt++;
                    }
                }

            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Sol24 s=new Sol24();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(s.solution(n,m,arr));
    }
}
