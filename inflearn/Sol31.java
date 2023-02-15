package codingTest.inflearn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
    학급 회장(해쉬)
    containsKey() keySet() getOrDefault()
 */
public class Sol31 {

    public char solution1(int n,  char[] arr){
        char answer=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max=0;
        for(char c : map.keySet()){
            if(max<map.get(c)){
                max=map.get(c);
                answer=c;
            }
        }

//        Iterator it=map.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry entry=(Map.Entry)it.next();
//            System.out.println(entry);
//        }

        return answer;
    }

    public static void main(String[] args) {
        Sol31 s = new Sol31();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char[] arr=sc.next().toCharArray();
        System.out.println(s.solution1(n,arr));
    }
}
