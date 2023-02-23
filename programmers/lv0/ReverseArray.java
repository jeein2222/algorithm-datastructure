package codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//int[] 배열 뒤집기
public class ReverseArray {
    public static int[] solution(int[] num_list) {
        List<Integer> list=Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] num_list={1,2,3};
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
