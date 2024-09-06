package instaInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByLength {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Aravind","Srikand","Abhijit","Appu");

        Map<Integer, List<String>> groupedByLength = stringList.stream()
                .collect(Collectors.groupingBy(String::length));

        groupedByLength.forEach((lengths,string)->
                System.out.println("Length" + lengths + "String "+string ));
    }
}
