package codingTest;

//특정 문자 제거하기
public class RemoveString {
    public static String solution1(String my_string, String letter) {
        String[] str=my_string.split("");
        String answer="";
        for(String s: str){
            if(s.equals(letter))
                continue;
            answer+=s;
        }
        return answer;
    }

    public static String solution2(String my_string, String letter) {
        String answer="";
        answer=my_string.replace(letter, "");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2("hello","o"));
    }

}
