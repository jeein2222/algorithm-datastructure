package codingTest.programmers.lv01;

//삼총사

/*
 * 3명의 학생의 번호 합 =0 -> 삼총사
 * -2 3 0 2 -5
 * 1. -2 0 2
 * 2. 3 2 -5
 * -> 2가지 삼총사
 */
class Solution06 {
    int count = 0;
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;
        boolean[] visited = new boolean[n];

        
        answer=combination(number, visited, 0, n, 3);
        count = 0;

        return answer;
    }
    
    int combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            if (sum(arr, visited, n) == 0)
                count++;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
        return count;
    }

    int sum(int[] arr, boolean[] visited, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}

public class sol06 {
    public static void main(String[] args) {
        Solution06 s = new Solution06();
        
        System.out.println(s.solution(new int[] { -2, 3, 0, 2, -5 }));
        System.out.println(s.solution(new int[]{-3,-2,-1,0,1,2,3}));
        System.out.println(s.solution(new int[]{-1,1,-1,1}));
        
    }
}
