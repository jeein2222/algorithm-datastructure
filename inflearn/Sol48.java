package codingTest.inflearn;

import java.util.LinkedList;
import java.util.Queue;

//송아지 탐색
/*
    수직선상 현수, 송아지 송아지는 부동 현수 앞 1 뒤 1 앞 5
    최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지

 */
public class Sol48 {
    int[] ch = new int[10001];
    int[] dis = {1, -1, 5};

    Queue<Integer> q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch[s] = 1;
        q.offer(s);
        int L=0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
                int x = q.poll();
                for(int j=0;j<dis.length;j++){
                    int nx = x + dis[j];
                    if(nx==e) return L + 1;
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Sol48 s = new Sol48();
        System.out.println(s.BFS(5,14));

    }
}
