package codingTest.inflearn;

import java.util.Scanner;

//유효한
public class Sol8 {
    public int solution(String s){
        char[] arr=s.toCharArray();
        String answer="";
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i]))
                answer+=arr[i];
        }
        return Integer.valueOf(answer);
    }

    public static void main(String[] args) {
        Sol8 s=new Sol8();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
