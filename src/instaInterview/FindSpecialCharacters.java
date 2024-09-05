package instaInterview;

import java.util.List;
import java.util.stream.Collectors;

public class FindSpecialCharacters {

    public static void main(String[] args) {

        String input = "Hello, World! 123";

        List<Character> specialCharacters = input.chars()
                .filter(ch-> ! Character.isLetterOrDigit(ch))
                .mapToObj(c-> (char) c)
                .toList();

        System.out.println(specialCharacters);
    }
}
