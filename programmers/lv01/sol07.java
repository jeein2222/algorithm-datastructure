package codingTest.programmers.lv01;

/* 옹알이2
 * "aya", "ye", "woo", "ma" 네가지 + 네가지 조합
 */

class Solution07 {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] oArr={ "aya", "ye", "woo", "ma"};
        String[] rArr={"ayaaya","yeye","woowoo","mama"};
        
        for(String bab:babbling){
            for(String rBab:rArr){
                bab = bab.replace(rBab, "X");
                System.out.println(bab);
            }
            for(String oBab:oArr){
                bab = bab.replace(oBab, "Y");
                System.out.println(bab);
                
            }
            
            boolean sign=true;
            
            for(int i=0;i<bab.length();i++){
                if(!bab.substring(i,i+1).equals("Y")){
                    sign=false;
                    break;
                }
            }
            
            if(sign==true){
                answer++;
            }
        }
        return answer;
        
    }
}


public class sol07 {
    public static void main(String[] args) {
        Solution07 s = new Solution07();
        System.out.println(s.solution(new String[] {"aya","yee","u","maa"}));
    }
    
}
