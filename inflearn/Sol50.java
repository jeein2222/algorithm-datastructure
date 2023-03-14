package codingTest.inflearn;

/*
    BFS로 풀어야지 맞으나 DFS로 풀어야 함. -> DFS의 경우 자식이 하나만 있으면 X
    tree 말단 노드까지의 가장 짧은 경로
    루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램 작성
    각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선의 개수를 길이로 함.
            1
        2       3
    4       5
 */

class Node3{
    int data;
    Node3 lt,rt;

    public Node3(final int data) {
        this.data = data;
        lt=null;
        rt=null;
    }
}

public class Sol50 {
    Node3 root;
    public int DFS(int L,Node3 root){
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }
    public static void main(String[] args) {
        Sol50 s = new Sol50();
        s.root = new Node3(1);
        s.root.lt = new Node3(2);
        s.root.rt = new Node3(3);
        s.root.lt.lt = new Node3(4);
        s.root.lt.rt = new Node3(5);
        System.out.println(s.DFS(0, s.root));

    }
}
