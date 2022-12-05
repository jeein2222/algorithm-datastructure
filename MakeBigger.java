package codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//정수 배열에서 두 개 원소를 곱해서 나올 수 있는 가장 큰 값
public class MakeBigger {
    public static int solution1(int[] numbers) {
        List<Integer> integerList= Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(integerList);
        int lastIndex=numbers.length-1;
        return integerList.get(lastIndex)*integerList.get(lastIndex-1);
    }

    public static int solution2(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }

    public static int solution3(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j< numbers.length;j++){
                if(numbers[i]<numbers[j]){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }

    public static void main(String[] args) {
        int[] num_list={1,2,0,4,5};
        System.out.println(solution1(num_list));//20
    }
}
