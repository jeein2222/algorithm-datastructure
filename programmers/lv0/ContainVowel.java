package codingTest;


import java.util.Arrays;

public class ContainVowel {
    public String solution1(String my_string) {
        String[] vowels=new String[]{"a","i","e","o","u"};
        for(String vowel:vowels){
            if(my_string.contains(vowel)){
                my_string=my_string.replace(vowel,"");
            }
        }
        return my_string;
    }

    public String solution2(String my_string){
        String answer="";
        answer=my_string.replaceAll("[aeiou]","");
        return answer;
    }
}
