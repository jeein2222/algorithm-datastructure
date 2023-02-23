package codingTest.inflearn;

import java.util.HashMap;
import java.util.Scanner;

/*
    모든 아나그램 찾기(Hashmap sliding window)
 */
public class Sol34 {
    /*
        l r
        bacaAacba
        abc


     */
    public int solution1(String s, String t){
        int answer=0;
        HashMap<Character,Integer> hm1 = new HashMap<>();//s
        HashMap<Character,Integer> hm2 = new HashMap<>();//t

        for(int i=0;i<t.length()-1;i++){
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0;i<t.length();i++){
            hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i), 0) + 1);
        }

        int lt=0;
        for(int rt=t.length()-1;rt<s.length();rt++){
            hm1.put(s.charAt(rt), hm1.getOrDefault(s.charAt(rt), 0) + 1);
            if(hm1.equals(hm2)) answer++;
            hm1.put(s.charAt(lt), hm1.get(s.charAt(lt)) -1);
            if(hm1.get(s.charAt(lt))==0) hm1.remove(s.charAt(lt));
            lt++;
        }
        return answer;

    }

    public static void main(String[] args) {
        Sol34 ss = new Sol34();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(ss.solution1(s,t));
    }
}
