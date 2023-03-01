package codingTest.programmers.lv01;

//둘만의 암호
/*
    "aukks","wbqd",5
    char c=a  abcdef
              i=1 b
              i=2 c cnt=1
              i=3 d
              i=4 e cnt=2
              i=5 f cnt=3
              i=6 g cnt=4
              i=7 h cnt=5
 */
public class sol23 {
    public String solution(String s, String skip, int index){
        String answer = "";
        for(char c:s.toCharArray()){
            for(int j=0;j<index;j++){
                do{
                    c++;
                    if(c>'z') c-=26;
                }while(skip.contains(Character.toString(c)));
            }
            answer+=c;
        }
        return answer;
    }
    public static void main(String[] args) {
        sol23 s = new sol23();
        System.out.println(s.solution("aukks","wbqd",5));
        System.out.println(s.solution("happy","abcd",5));
        System.out.println(s.solution("zrabc","def",5));
    }
}
