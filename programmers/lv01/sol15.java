package codingTest.programmers.lv01;

import java.util.ArrayList;
import java.util.Arrays;

/*
    없는 숫자 더하기
 */
public class sol15 {
    public int solution1(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        for(int i=0;i<numbers.length;i++){
            if(list.contains(numbers[i])){
                list.remove((Integer)numbers[i]);
            }

        }
        for(int a:list){
            answer+=a;
        }

        return answer;
    }
    public int solution2(int[] numbers) {
        int sum=45;
        for(int i:numbers){
            sum-=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        sol15 s=new sol15();
        System.out.println(s.solution2(new int[] {1,2,3,4,6,7,8,0}));
        System.out.println(s.solution2(new int[] {5,8,4,0,6,7,9}));
    }
}
