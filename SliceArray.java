package codingTest;

import java.util.Arrays;

public class SliceArray {
    public static int[] solution1(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i=num1, j=0;i<=num2 && j<=answer.length;i++,j++){
            answer[j]=numbers[i];
        }
        return answer;
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers,num1,num2+1);
    }

    public static void main(String[] args) {
        int[] num_list={1,2,3,4,5};
        System.out.println(Arrays.toString(solution2(num_list,1,3)));//[2,3,4]
    }

}
