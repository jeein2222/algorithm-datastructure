package codingTest.inflearn;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//문장 속 단어->가장 긴 단어 출력
public class Sol3 {
    public String solution(String s){
        //1번
//        String[] arr=s.split(" ");
//        int maxIndex=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i].length()>arr[maxIndex].length())
//                maxIndex=i;
//        }
//        return arr[maxIndex];
        //2번
//        StringTokenizer st=new StringTokenizer(s);
//        String maxString="";
//        while(st.hasMoreTokens()){
//            String str=st.nextToken();
//            if(str.length()>maxString.length())
//                maxString=str;
//        }
//        return maxString;
        //3번
        String answer="";
        int m=Integer.MIN_VALUE, pos;
        while((pos=s.indexOf(' '))!=-1){
            String tmp=s.substring(0,pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            s=s.substring(pos+1);
        }
        if(s.length()>m) answer=s;
        return answer;
    }

    public static void main(String[] args) {
        Sol3 s=new Sol3();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();//주의!!!

        System.out.println(s.solution(str));
    }
}
