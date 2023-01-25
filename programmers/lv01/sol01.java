package codingTest.programmers.lv01;

import java.util.*;


//개인정보 수집 유효기간

class Solution01 {

    private int[] addDays(int year, int month, int day, int term) {

        int[] days = new int[3];
        days[0] = year + (month + term) / 12;
        days[1] = (month + term) % 12;
        days[2] = day;

        if (day == 0) {
            days[1] -= 1;
            days[2] = 28;
        }
        if (days[1] == 0) {
            days[0] -= 1;
            days[1] = 12;
        }
        return days;

    }

    private boolean isLonger(int[] A, int[] B) {
        for (int i = 0; i < 3; i++) {
            if (A[i] < B[i]) {
                return true;
            } else if (A[i] > B[i]) {
                return false;
            }
        }
        return false;
    }

    private int[] transDayToInt(String day) {
        int[] answer = new int[3];
        String[] days = day.split("[.]");
        for (int i = 0; i < 3; i++) {
            answer[i] = Integer.parseInt(days[i]);
        }
        return answer;
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < terms.length; i++) {
            String[] cur = terms[i].split(" ");
            map.put(cur[0], Integer.parseInt(cur[1]));
        }

        int[] todays = transDayToInt(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] cur = privacies[i].split(" ");
            int[] day = transDayToInt(cur[0]);
            int[] curDay = addDays(day[0], day[1], day[2] - 1, map.get(cur[1]));

            if (isLonger(curDay, todays)) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class sol01 {
    public static void main(String[] args) {
        Solution01 s=new Solution01();
        String[] terms={"A 6", "B 12", "C 3"};
        String[] privacies={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(Arrays.toString(s.solution("2022.05.19", terms, privacies)));
        
    }
    
}
