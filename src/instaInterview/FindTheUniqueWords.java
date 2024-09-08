package instaInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheUniqueWords {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "Java is a programming language",
                "Stream API makes Java powerful",
                "Java programming is fun"
        );

        Set<String> uniqueWords = sentences.stream()
                .flatMap(sentence-> Arrays.stream(sentence.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        System.out.println(uniqueWords);
    }
}
