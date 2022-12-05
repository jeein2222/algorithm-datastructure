package codingTest;

import java.util.Arrays;

public class DoubleArray {
    public static int[] solution(int[] numbers){
        return Arrays.stream(numbers).map(i->i*2).toArray();
    }

    public static void main(String[] args) {
        int[] num_list={1,2,3};
        System.out.println(Arrays.toString(solution(num_list)));//[2,4,6
    }
}
