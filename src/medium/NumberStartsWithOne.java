package medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithOne {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(1,2,3,10,23,12,14);

        numberStartsWithOne(integerList)
                .forEach(System.out::println);

    }

    private static List<String> numberStartsWithOne(List<Integer> integerList){
        return integerList.stream()
                .map(num -> num + " ")
                .filter(s->s.startsWith("1")).collect(Collectors.toList());
    }
}
