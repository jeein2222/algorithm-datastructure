package codingTest;

//순서쌍 찾기
/*
    20 : (1,20),(2,10),(4,5),(5,4),(10,2),(20,1)
    100 : (1,100),(2,50),(4,25),(5,20),(10,10),(20,5),(25,4),(50,2),(100,1)

 */
public class FindPair {
    public static int solution(int n) {
        int answer = 0;
        int sqr=(int)Math.sqrt(n);
        for(int i=1;i<=sqr;i++){
            if(n%i==0){
                answer++;
                System.out.print(i);
            }
        }
        System.out.println(sqr);

        if(Math.pow(sqr,2)==n){
            answer=answer*2-1;
        }else{
            answer=answer*2;
        }

        return answer;
    }
    //1 99 3 33 9 11
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.println(i+":"+solution(i));
        }

    }
}
