package codingTest;

public class StringSum {
    public static int solution(String my_string){
        String[] list=my_string.split("");
        int sum=0;
        for(int i=0;i<list.length;i++){
            try{
                int num=Integer.parseInt(list[i]);
                sum+=num;
            }catch (NumberFormatException ex){
                continue;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(solution("aB123"));
    }

}
