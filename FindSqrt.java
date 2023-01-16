package codingTest;

//해당 숫자가 제곱수인지 아닌지 판단
public class FindSqrt {
    public int solution(int n) {
        double d=Math.sqrt(n);
        if((int)d==d){//d.intValue()
            return 1;
        }else{
            return 2;
        }
    }

    public static void main(String[] args) {
        FindSqrt fs=new FindSqrt();
        System.out.println(fs.solution(26));
    }
}
