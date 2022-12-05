package codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//문자열 뒤집어 문자열로 리턴
public class ReverseString {
    public static String solution1(String my_string) {
        String answer = "";
        List<String> stringList= Arrays.asList(my_string.split(""));
        Collections.reverse(stringList);
        //String.join은 List에서도 가능하다.
        answer=String.join("",stringList);
        return answer;
    }

    public static String solution2(String my_string){
        StringBuilder sb=new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution2("hello"));
    }
}
