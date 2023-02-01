package codingTest.inflearn;

import java.util.Scanner;

//대문자는 소문자로 소문자는 대문자로
public class Sol2 {

    public String solution(String s){
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){//forEach문으로는 배열의 값을 수정할 수 없다.(배열의 값을 복사해서 가져온 것이기때문에)
            if (65 <= arr[i] && arr[i] <= 90) {//대문자의 경우
                arr[i] = Character.toLowerCase(arr[i]);
                }
            else if (97 <= arr[i] && arr[i] <= 122){//소문자의 경우
                arr[i] = Character.toUpperCase(arr[i]);
                }
        }

        String str=new String(arr);

        return str;
//        String answer="";
//        for(char x:s.toCharArray()){
//            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//            else answer+=Character.toLowerCase(x);
//        }
//        return answer;

    }

    public static void main(String[] args) {
        Sol2 s=new Sol2();
        Scanner in=new Scanner(System.in);
        String str=in.next();

        System.out.println(s.solution(str));
        return ;
    }
}
