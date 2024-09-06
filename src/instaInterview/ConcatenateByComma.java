package instaInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateByComma {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Aravind","Sreelanth","Aswin","Abhijith");

        String resultString = String.join(",", stringList);
        System.out.println(resultString);
    }
}
