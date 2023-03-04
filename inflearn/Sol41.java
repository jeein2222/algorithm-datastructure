package codingTest.inflearn;

//재귀함수
public class Sol41 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Sol41 s = new Sol41();
        s.DFS(5);
    }
}
