package instaInterview;

import java.util.Arrays;
import java.util.List;

public class FilterOutList {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,9,11,12,13,14,15);
        double average = integerList.stream()
                .filter(num->num< 10 )
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(average);

    }
}
