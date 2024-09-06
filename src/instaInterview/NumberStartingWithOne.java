package instaInterview;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(1,20,34,28,19,22,14,15);
        List<Integer> startingOneList = integerList.stream()
                .filter(num ->String.valueOf(num).startsWith("1"))
                .toList();

        System.out.println(startingOneList);
    }
}
