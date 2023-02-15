package codingTest.inflearn;

import java.util.HashMap;
import java.util.Scanner;

/*
    아나그램 : 두 문자열이 알파벳의 순서는 다르지만 그 구성이 일치한 경우

 */
public class Sol32 {
    public String solution1(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
           if(map.containsKey(c)&&map.get(c)!=0){
               map.put(c,map.get(c)-1);
           }else{
               return "NO";
           }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Sol32 s = new Sol32();
        Scanner sc = new Scanner(System.in);

        String s1=sc.next();
        String s2=sc.next();
        System.out.println(s.solution1(s1,s2));
    }

}
