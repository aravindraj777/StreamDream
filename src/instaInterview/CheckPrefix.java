package instaInterview;

import java.util.Arrays;
import java.util.List;

public class CheckPrefix {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Aravind","Aran","Srikand","Mukes");

        String prefix = "Ar";
        boolean isAvailable = stringList.stream()
                .anyMatch(str->str.startsWith(prefix));

        System.out.println(isAvailable);

    }
}
