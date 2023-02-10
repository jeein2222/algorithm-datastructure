package codingTest.programmers.lv01;

/*
    약수의 개수와 덧셈
 */
public class sol18 {
    public int countDivisors(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(i*i==n) count++;
            else if(n%i==0) count+=2;
        }
        return count;
    }
    public int solution(int left,int right){
        int answer=0;
        for(int i=left;i<=right;i++){
            if(countDivisors(i)%2==0) answer+=i;
            else answer-=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        sol18 s = new sol18();
        System.out.println(s.solution(13,17));
    }
}
