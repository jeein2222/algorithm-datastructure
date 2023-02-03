package codingTest.inflearn;

import javax.security.auth.callback.CallbackHandler;
import java.util.*;

//문자열 압축
public class Sol11 {

    //mine
    //KKHSSSSSSSE -> K2HS7E
    //KSTTTSEEKFKKKDJJGG-> KST3SE2KFK3DJ2G2
    public String solution1(String s){
        char[] arr=s.toCharArray();
        int count=1;
        String answer="";
        for(int i=0;i<arr.length-1;i++){
            if(i==arr.length-2){
                if(arr[i]==arr[i+1]){
                    count++;
                    answer+=arr[i]+""+count;
                }else{
                    answer+=arr[i]+""+count+""+arr[i+1];
                }
            }else{
                if(arr[i]==arr[i+1]){
                    count++;
                }else{
                    if(count>1)
                        answer+=arr[i]+""+count;
                    else
                        answer+=arr[i]+"";
                    count=1;
                }
            }
        }
        return answer;
    }

    //answer
    public String solution2(String str){
        String answer="";
        str+=" ";//빈 문자열 하나 추가
        int cnt=1;
        for(int i=0;i< str.length()-1;i++){
            if(str.charAt(i)== str.charAt(i+1)) cnt++;
            else{
                answer += str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol11 s=new Sol11();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(s.solution1(str));
        System.out.println(s.solution2(str));
    }
}
