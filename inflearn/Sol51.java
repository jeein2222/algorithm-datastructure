package codingTest.inflearn;
/*
    BFS
    tree 말단 노드까지의 가장 짧은 경로
    루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램 작성
    각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선의 개수를 길이로 함.
            1
        2       3
    4       5
 */

import java.util.LinkedList;
import java.util.Queue;

class Node4{
    int data;
    Node4 lt,rt;

    public Node4(final int data) {
        this.data = data;
        lt = null;
        rt = null;

    }
}

public class Sol51 {
    Node4 root;

    public int BFS(Node4 root){
        Queue<Node4> queue = new LinkedList<>();
        queue.offer(root);
        int L=0;
        while(!queue.isEmpty()){
            int len=queue.size();
            for (int i = 0; i < len; i++) {
                Node4 curr = queue.poll();
                if(curr.lt==null&&curr.rt==null) return L;
                if(curr.lt!=null) queue.offer(curr.lt);
                if(curr.rt!=null) queue.offer(curr.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Sol51 s = new Sol51();
        s.root = new Node4(1);
        s.root.lt = new Node4(2);
        s.root.rt = new Node4(3);
        s.root.lt.lt = new Node4(4);
        s.root.lt.rt = new Node4(5);
        System.out.println(s.BFS(s.root));

    }
}
