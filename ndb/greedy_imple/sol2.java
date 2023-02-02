package codingTest.ndb.greedy_imple;

class Solution02{
    public int solution(int money){
        int[] arr={500,100,50,10};
        int count=0;
        for(int m:arr){
            count+=money/m;
            money%=m;
        }
        return count;

    }
}
public class sol2 {
    public static void main(String[] args) {
        Solution02 s=new Solution02();
        System.out.println(s.solution(1260));
    }
}
