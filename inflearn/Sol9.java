package codingTest.inflearn;

import java.util.Scanner;

//유효한
public class Sol9 {
    //mine
    public int solution1(String s){
        char[] arr=s.toCharArray();
        String answer="";
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i]))
                answer+=arr[i];
        }
        return Integer.valueOf(answer);
        //return Integer.parseInt(answer);
    }
    //answer
    public int solution2(String s){
        char[] arr=s.toCharArray();
        int answer=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=48 && arr[i]<=57)//0~9숫자인 경우
                answer=answer*10+(arr[i]-48);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol9 s=new Sol9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution1(str));
        System.out.println(s.solution2(str));
    }
}
