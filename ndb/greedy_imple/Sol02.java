package codingTest.inflearn.greedy_imple;

/*
    거스름돈 문제
    카운터에 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전히 무한히 존재한다고 가정.
    손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어야할 동전의 최소 개수를 구하시오.(N은 항상 10의 배수이다.)
    -> sol) 가장 큰 화폐 단위부터 돈을 거슬러 준다.
    -> why) 큰 단위의 동전이 항상 작은 단위의 동전의 배수이므로
    -> if) 화폐 단위가 서로 배수 관계가 아니면, 다이나믹 프로그래밍으로 해결해야 한다.
 */
class Sol02 {
    public int solution(int money){
        int[] arr={500,100,50,10};
        int count=0;
        for(int m:arr){
            count+=money/m;
            money%=m;
        }
        return count;

    }
    public static void main(String[] args) {
        Sol02 s=new Sol02();
//        System.out.println(s.solution(1260));


        System.out.println("name😉 : Jeein Park");
        System.out.println("code💻 : Java, Python, Javascript, CSS, HTML5,");
        System.out.println("tools🛠 : Spring, Spring Boot, Django, React, Node");
        System.out.println("motto✨ : The best way to predict the future is to invent it.");




    }
}
