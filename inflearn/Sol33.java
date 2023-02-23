package codingTest.inflearn;

import java.util.*;

/*
    매출액의 종류(Hash, Sliding Window)
    20 12 20 10 23 17 10
 */
public class Sol33 {
    //time limit exceed
    public int[] solution1(int n,int k,int[] arr){
        int[] answer = new int[n - k + 1];
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<answer.length;i++){
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            answer[i]=set.size();
            set.clear();
        }

        return answer;
    }

    /*
            lt       rt
        arr=20 12 20 10 23 17 10
        hm=(20,2),(12,1),(10,1)

               lt       rt
        arr=20 12 20 10 23 17 10
        hm=(20,1),(12,1),(10,1),(23,1)

                  lt       rt
        arr=20 12 20 10 23 17 10
        hm=(20,1),(10,1),(23,1),(17.1)


     */
    public ArrayList<Integer> solution2(int n,int k,int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<k-1;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        int lt=0;
        for(int rt=k-1;rt<n;rt++){
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[lt],hm.get(arr[lt])-1);
            if(hm.get(arr[lt])==0) hm.remove(arr[lt]);
            lt++;
        }
        return answer;
    }



    public static void main(String[] args) {
        Sol33 s = new Sol33();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i: s.solution2(n,k,arr))
            System.out.print(i+" ");
    }
}
