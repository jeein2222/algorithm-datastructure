package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareArray {
    public static int solution1(String[] s1, String[] s2) {
        ArrayList<String> arrayList1=new ArrayList<>(Arrays.asList(s1));
        ArrayList<String> arrayList2=new ArrayList<>(Arrays.asList(s2));

        if(arrayList1.size()>arrayList2.size()){
            arrayList1.retainAll(arrayList2);
            return arrayList1.size();
        }else{
            arrayList2.retainAll(arrayList1);
            return arrayList2.size();
        }
    }

    public static int solution2(String[] s1, String[] s2){
        int count=0;
        List<String> stringList=Arrays.stream(s1).collect(Collectors.toList());
        for(String string:s2){
            if(stringList.contains(string))
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution1(new String[]{"a","b","c"},new String[] {"a","b"}));
    }
}
