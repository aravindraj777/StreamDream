package instaInterview;

import java.util.stream.Collectors;

public class RemoveCharacterOccurrences {

    public static void main(String[] args) {

        String str = "Banana";
        char removingCharacter = 'a';

        String filteredString  = str.chars()
                .filter(ch-> ch!= removingCharacter)
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());

        System.out.println("Filtered String = "+ filteredString);
    }
}
