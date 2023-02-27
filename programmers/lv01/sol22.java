package codingTest.programmers.lv01;

import java.util.ArrayList;

/*
    3진법 뒤집기
 */
public class sol22 {
    public int solution(int n){
        int answer=0;
        ArrayList<Integer> list = new ArrayList<>();
        //10진법 -> 3진법
        while(n!=0){
            list.add(n%3);
            n/=3;
        }
        System.out.println(list);//[0, 0, 2, 1]

        //3진법 -> 10진법
        int tmp=1;
        for(int i=list.size()-1;i>=0;i--){
            answer+=list.get(i)*tmp;
            tmp*=3;
        }
        return answer;
    }

    public static void main(String[] args) {
        sol22 s = new sol22();
        System.out.println(s.solution(45));
    }
}
