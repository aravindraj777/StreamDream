package instaInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToLength {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Aravind", "Sreekanth","Abhijith","Amar");

       List<Integer> lengthList = stringList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengthList);
    }
}
