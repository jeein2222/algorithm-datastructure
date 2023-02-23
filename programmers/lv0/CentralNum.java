package codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//중앙값 찾기
public class CentralNum {

    public static int solution(int[] array){
        List<Integer> arrayList=Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(arrayList);
        return arrayList.get((0+arrayList.size())/2);
    }

    public static int solution2(int[] array){
        Arrays.sort(array);
        return array[array.length>>1];
    }

    public static int solution3(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[j]<array[i]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
        return array[array.length/2];
    }

    public static void main(String[] args) {
        System.out.println(solution3(new int[] {1,2,7,10,11}));
    }
}
