package codingTest.inflearn;

import java.util.Scanner;
import java.util.Stack;

//크레인 인형 뽑기
public class Sol38 {
    //my solution...
    public int solution1(int n, int[][] arr, int m, int[] moves){
        int cnt=0;
        Stack<Integer>[] stack=new Stack[n];
        Stack<Integer> result = new Stack<>();

        for(int i=0;i<n;i++){
            stack[i]=new Stack<Integer>();
        }

        //각 column에 queue를 하나씩 배정하고, 값 삽입
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(arr[j][i]!=0) stack[i].push(arr[j][i]);
            }
        }

        //해당 열의 stack에서 pop해서 result에 push
        int col=0;
        for(int i=0;i<m;i++){
            col=moves[i]-1;
            if(stack[col].size()>0){
                int p = stack[col].pop();
                if(result.size()>0 && result.peek()==p){
                    result.pop();
                    cnt+=2;
                }else result.push(p);
            }
        }

        return cnt;
    }

    //answer
    public int solution2(int n,int[][] arr, int m, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(int pos:moves){
            for(int i=0;i<n;i++){
                if(arr[i][pos-1]!=0){
                    int tmp=arr[i][pos-1];
                    arr[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Sol38 s = new Sol38();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int m=sc.nextInt();
        int[] moves=new int[m];
        for(int i=0;i<m;i++){
            moves[i]=sc.nextInt();
        }
        System.out.println(s.solution1(n,arr,m,moves));
        System.out.println(s.solution2(n,arr,m,moves));
    }
}
