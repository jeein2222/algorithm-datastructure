package codingTest.programmers.lv01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

//개인정보 수집 유효기간

class Solution01 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] todays = today.split("\\.");
        int[] todayInfo=Stream.of(todays).mapToInt(Integer::parseInt).toArray();
        
        HashMap<String, Integer> map=new HashMap<>();
        
        for (String s : terms) {
            String[] term = s.split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] info = privacies[i].split("\\.| ");
            int year = Integer.parseInt(info[0]);
            int month = Integer.parseInt(info[1]);
            int date = Integer.parseInt(info[2]);
            String term = info[3];
            int newYear=year;
            if (map.get(term) + month > 12) {
                newYear = (map.get(term) + month) / 12 + year;
            } 
            
            int newMonth;
            if (newYear !=year) {
                newMonth = (map.get(term) + month) % map.get(term);
            } else {
                newMonth = (map.get(term) + month);
            }

            int newDate = date;

            System.out.println(newYear +","+newMonth+","+newDate);
           
            if (newYear < todayInfo[0]) {
                answer.add(i+1);
            } else if(newYear == todayInfo[0] && newMonth<todayInfo[1]) {
               answer.add(i+1);
            } else if (newYear == todayInfo[0] && newMonth == todayInfo[1] && newDate <= todayInfo[2]) {
                answer.add(i+1);
            }
        }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
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
