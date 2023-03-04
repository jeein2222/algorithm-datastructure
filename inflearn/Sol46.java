package codingTest.inflearn;

public class Sol46 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L==n+1){
            String tmp = "";
            for(int i=0;i<ch.length;i++){
                if(ch[i]==1) tmp += i + " ";
            }
            if(tmp.length()>0) System.out.println(tmp);
        }else{
            ch[L]=1;
            DFS(L + 1);
            ch[L]=0;
            DFS(L + 1);
        }
    }
    public static void main(String[] args) {
        Sol46 s = new Sol46();
        n=3;
        ch = new int[n + 1];
        s.DFS(1);
    }
    /*
        1 2 3
                   D(1) : 사용한다, 사용하지 않는다
             D(2)        D(2)
          D(3)  D(3)  D(3)  D(3)
     */
}
