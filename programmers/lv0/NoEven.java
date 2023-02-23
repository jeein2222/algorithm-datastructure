package codingTest;

import java.util.ArrayList;
import java.util.List;

public class NoEven {
    public static int[] solution(int n) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<=n;i++){
            if(i%2==0)
                continue;
            list.add(i);
        }

        int[] answer=list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    public static void main(String[] args) {

    }
}
