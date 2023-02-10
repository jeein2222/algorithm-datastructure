package codingTest.programmers.lv01;

import java.util.*;

public class sol19 {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                s.add(numbers[i]+numbers[j]);
            }
        }
        Iterator it=s.iterator();
        while(it.hasNext()){
            answer.add((Integer) it.next());
        }
        answer.sort(Comparator.naturalOrder());
        return answer;
    }
    public static void main(String[] args) {
        sol19 s = new sol19();
        System.out.println(s.solution(new int[] {2,1,3,4,1}));
        System.out.println(s.solution(new int[] {5,0,2,7}));


    }
}
