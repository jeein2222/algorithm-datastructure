package codingTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddArray {
    public static int[] solution1(int[] num_list) {
        int[] answer = new int[2];
        List<Integer> list=Arrays.stream(num_list).boxed().collect(Collectors.toList());
        int countEven= list.stream().filter(t->t%2==0).collect(Collectors.toList()).size();
        int countOdd=num_list.length-countEven;
        answer[0]=countEven;
        answer[1]=countOdd;
        return answer;
    }

    public static int[] solution2(int[] num_list){
        int[] answer=new int[2];
        for(int i=0;i<num_list.length;i++){
            answer[num_list[i]%2]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list={1,2,3,4,5};
        System.out.println(Arrays.toString(solution2(num_list)));//[2,3]
    }
}
