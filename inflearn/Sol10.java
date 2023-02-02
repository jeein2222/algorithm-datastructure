package codingTest.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//문자 거리
public class Sol10 {
    public String solution1(String str,char c){
        char[] arr=str.toCharArray();
        String answer="";
        ArrayList<Integer> indexList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c){
                indexList.add(i);
            }
        }
//        System.out.println(indexList);
        for(int i=0;i<arr.length;i++){
            answer+=findMin(indexList,i)+" ";
        }
        return answer;
    }

    public int findMin(ArrayList<Integer> list,int a) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(min>Math.abs(a-list.get(i))){
                min=Math.abs(a-list.get(i));
            }
//            System.out.println(min);
        }
        return min;
    }

    //for문 방향 -> <- 으로 한번씩
    public String solution2(String str, char t){
        char[] arr=str.toCharArray();
        int[] lenArr=new int[arr.length];
        int len=1000;
        String answer="";
        //왼쪽에서 오른쪽으로
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t) {
                len = 0;
                lenArr[i]=len;
            }else{
                len++;
                lenArr[i]=len;
            }
        }
        System.out.println(Arrays.toString(lenArr));

        len=1000;
        //오른쪽에서 왼쪽으로
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==t){
                len=0;
            }else{
                len++;
                lenArr[i]=Math.min(lenArr[i],len);
            }
        }

        System.out.println(Arrays.toString(lenArr));
        for(int i:lenArr){
            answer+=i+" ";
        }

        return answer;
    }


    public static void main(String[] args) {
        Sol10 s=new Sol10();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char c=sc.next().charAt(0);

        System.out.println(s.solution1(str, c));//1 0 1 2 1 0 1 2 2 1 0
        System.out.println(s.solution2(str, c));

    }
}
