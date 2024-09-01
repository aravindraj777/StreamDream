package instaInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class InterviewMain {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        Map<Boolean,Long> sums = Operations.sumOfOddAndEven(integerList);
        System.out.println("Odd count = "+ sums.get(false));
        System.out.println("Even count = "+ sums.get(true));

    }
}
