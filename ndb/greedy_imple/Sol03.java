package codingTest.inflearn.greedy_imple;

import java.util.Scanner;

/*
    숫자 카드 게임
    NXM 행,열의 카드에서 먼저 뽑고자하는 카드가 포함되어있는 행을 선택
    그다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드 뽑기
    처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여
    최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다.
 */
public class Sol03 {

    public int solution(int n, int m, int[][] arr){
        int result=0;
        for(int i=0;i<n;i++){
            int min=10001;
            for(int j=0;j<m;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
            result=Math.max(result,min);
        }
        return result;
    }

    public static void main(String[] args) {
        Sol03 s=new Sol03();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                arr[i][j]=sc.nextInt();
        }

        System.out.println(s.solution(n,m,arr));
    }
}
