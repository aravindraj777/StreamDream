package instaInterview;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
         int sum = integerList.stream()
                .mapToInt(num->num * num)
                .sum();

        System.out.println("Sum of squares is "+ sum);
    }
}
