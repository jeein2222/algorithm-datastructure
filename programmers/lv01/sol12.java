package codingTest.programmers.lv01;

import java.nio.ShortBuffer;
import java.util.Arrays;

/*
 * 숫자 짝꿍
 * 공통으로 나타나는 정수를 이용하여 만들 수 있는 가장 큰 정수
 * 짝궁이 0으로만 구성되어 있으면 -> 0
 * 없으면 ->-1
 * 100 123450 1,0 -> 10
 * 204 234504 2,0,4 -> 420
 * 
 */
class Solution12 {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        //X,Y의 0~9까지 숫자의 개수 담을 배열
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        countNumbers(X, xArr);
        countNumbers(Y, yArr);


        //가장 큰 정수를 만들어야 하므로 뒤에서 부터
        for (int i = xArr.length - 1; i >= 0; i--) {
            while (xArr[i] >= 1 && yArr[i] >= 1) {//핵심!
                xArr[i]--;
                yArr[i]--;
                sb.append(i);
            }
        }
        
        if (sb.toString().equals("")) {
            return "-1";
        } else if (sb.toString().startsWith("0")) {
            return "0";
        } else {
            return sb.toString();
        }

    }

    private void countNumbers(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'0']++;
        }
    }
}

public class sol12 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        System.out.println(s.solution("5525","1255"));
    }
    
}
