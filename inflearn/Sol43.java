package codingTest.inflearn;

//팩토리얼
public class Sol43 {
    //재귀함수
    public int DFS(int n){
        if(n==1) return 1;
        else {
            return n*DFS(n-1);
        }
    }

    //for문
    public int solution2(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        Sol43 s = new Sol43();
        System.out.println(s.DFS(5));
        System.out.println(s.solution2(5));
    }
}
