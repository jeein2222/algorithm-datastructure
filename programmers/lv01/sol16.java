package codingTest.programmers.lv01;

/*
    부족한 금액 계산하기

 */
public class sol16 {
    public long solution(int price, int money, int count) {
        long sum=0;
        for(int i=1;i<=count;i++){
            sum+=price*i;
        }
        if(sum<=money) return 0;

        return sum-money;
    }
    public static void main(String[] args) {
        sol16 s = new sol16();
        System.out.println(s.solution(3,20,4));
    }
}
