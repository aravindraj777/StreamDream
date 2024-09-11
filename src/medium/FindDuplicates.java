package medium;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,1,3,4,4);
        findDuplicates(integerList)
                .forEach(System.out::println);

    }
    private static List<Integer> findDuplicates(List<Integer> integerList){
        Set<Integer> set = new HashSet<>();
        return integerList.stream()
                .filter(num->!set.add(num))
                .collect(Collectors.toList());
    }
}
