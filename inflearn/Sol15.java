package codingTest.inflearn;

import java.util.Scanner;

//가위바위보
public class Sol15 {
    //가,바,보 1,2,3 비기면 D
    /*  A B
        1,2->2
        1,3->1
        2,3->3
     */
    public void solution1(int n, int[] a, int[] b){
        for(int i=0;i<n;i++){
            if(a[i]==b[i]) System.out.println("D");
            else if(a[i]==1&&b[i]==3) System.out.println("A");
            else if(a[i]==2&&b[i]==1) System.out.println("A");
            else if(a[i]==3&&b[i]==2) System.out.println("A");
            else System.out.println("B");
        }
    }

    public static void main(String[] args) {
        Sol15 s=new Sol15();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        s.solution1(n,a,b);
    }
}
