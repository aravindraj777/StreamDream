package instaInterview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrences {

    public static void main(String[] args) {

        String str = "This is a sea";

        Map<Character,Long> characterCount  = countCharacterOccurrences(str);
        characterCount.forEach((character,count)->
                System.out.println(character+ " - " + count));

    }

    private static Map<Character,Long> countCharacterOccurrences(String str){
        return str.chars()
                .mapToObj(ch->(char) ch)
                .filter(c-> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
