package codingTest.inflearn;

//피보나치 수열(메모이제이션) -> 다이나믹 프로그래밍
public class Sol44 {
    //방문한 기록
    static int[] dp;

    /**
     * @DFS :메모이제이션을 이용한 피보나치 문제 재귀 풀이
     */
    public int DFS(int n){
        //한 번 방문한 노드는 다시 방문하지 않도록
        if(dp[n]>0) return dp[n];
        if(n==1 || n==2) return dp[n]=1;
        else return dp[n]= DFS(n-1)+DFS(n-2);
    }

    /**
     *
     * @solution2 : 일반 for문을 사용한 피보나치 문제 풀이
     */

    public void solution2(int n){
        int first=1;
        int second=1;
        int third=0;
        for(int i=1;i<=n;i++){
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }

    public static void main(String[] args) {
        Sol44 s = new Sol44();
        int n=7;
        dp = new int[n + 1];

        //재귀+메모이제이션
        s.DFS(n);
        for(int i=1;i<=n;i++) System.out.print(dp[i]+" ");

        //for문
        s.solution2(n);

        /*
            for문이 재귀보다 더 빠르다. 재귀함수는 스택 프레임을 여러개 사용하기 때문에
            메모리를 많이 사용하여 성능이 안 좋다.

         */
    }
}
