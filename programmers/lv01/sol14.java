package codingTest.programmers.lv01;

/*
    최소직사각형
 */
public class sol14 {
    public int solution1(int[][] sizes){
        int answer=0;

        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
        }

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<sizes.length;i++){
            if(max1<sizes[i][0]){
                max1=sizes[i][0];
            }
            if(max2<sizes[i][1]){
                max2=sizes[i][1];
            }

        }
        answer=max1*max2;

        return answer;
    }
    public int solution2(int[][] sizes){
        int length=0, height=0;
        for(int[] card:sizes){
            length=Math.max(length,Math.max(card[0],card[1]));
            height=Math.max(height,Math.min(card[0],card[1]));
        }
        return length*height;
    }
    public static void main(String[] args) {
        sol14 s = new sol14();
        System.out.println(s.solution2(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(s.solution2(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7},{5,15}}));
        System.out.println(s.solution2(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7},{7,11}}));

    }
}
