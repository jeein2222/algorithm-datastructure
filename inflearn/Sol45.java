package codingTest.inflearn;

/*
    이진트리 깊이 우선 탐색(DFS)
          1
       2    3
     4  5  6  7

    전위 순회(뿌리를 먼저 방문, 부 - 왼 - 오) : 1 2 4 5 3 6 7
    중위 순회(왼쪽 하위 트리 방문 후 뿌리 방문, 왼 - 부 - 오) : 4 2 5 1 6 3 7
    후위 순회(하위 트리 모두 방문 후 뿌리 방문, 왼 - 오 - 부) : 4 5 2 6 7 3 1
 */

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data=val;
        lt=rt=null;
    }
}
public class Sol45 {
    Node root;

    /**
     * @DFS1 : 전위 순회
     */
    public void DFS1(Node root){
        if(root==null) return;
        else{
            System.out.print(root.data+" ");
            DFS1(root.lt);
            DFS1(root.rt);
        }
    }

    /**
     * @DFS2 : 중위 순회
     */
    public void DFS2(Node root){
        if(root==null) return;
        else{
            DFS2(root.lt);
            System.out.print(root.data+" ");
            DFS2(root.rt);
        }
    }

    /**
     * @DFS3 : 후위 순회
     */
    public void DFS3(Node root){
        if(root==null) return;
        else{
            DFS3(root.lt);
            DFS3(root.rt);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Sol45 tree = new Sol45();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS1(tree.root);
        System.out.println();
        tree.DFS2(tree.root);
        System.out.println();
        tree.DFS3(tree.root);
    }
}
