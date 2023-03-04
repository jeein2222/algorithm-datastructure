package codingTest.inflearn;

//재귀함수를 이용해 10진수를 2진수로 바꾸어보세요.
public class Sol42 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) {
        Sol42 s = new Sol42();
        s.DFS(6);
    }
    /*
        6/2=3 ...0
        3/2=1 ...1
        1/2=0 ...1

        6 -> 110
     */
}
