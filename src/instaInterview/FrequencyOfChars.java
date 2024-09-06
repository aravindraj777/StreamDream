package instaInterview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "Aravind";

        Map<Character,Long> characterFrequency = str.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(characterFrequency);
    }
}
