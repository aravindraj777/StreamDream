package instaInterview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String input = "sreekannthh";
        char nonRepeatingChar = findFirstNonRepeatingChar(input);
        System.out.println(" First Non repeating char is "+ nonRepeatingChar);


    }

    private static char findFirstNonRepeatingChar(String str){
        Map<Character, Long> characterCount = str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        return str.chars()
                .mapToObj(c ->(char) c)
                .filter(c->characterCount.get(c) == 1)
                .findFirst()
                .orElse('\0');
    }
}
