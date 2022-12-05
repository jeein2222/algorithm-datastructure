package codingTest;

import java.util.Arrays;
import java.util.List;

public class RepeatString {
    public static String solution1(String my_string, int n) {
        String[] str=my_string.split("");
        for(int i=0;i<str.length;i++){;
            str[i]=str[i].repeat(n);
        }
        return String.join("",str);
    }

    public static String solution2(String my_string, int n){
        StringBuilder sb=new StringBuilder();
        for(char c: my_string.toCharArray()){
            sb.append((c+"").repeat(n));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("hello",3));//20
    }
}
