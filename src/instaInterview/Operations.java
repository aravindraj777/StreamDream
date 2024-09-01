package instaInterview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Operations {

    public static Map<Boolean,Long> sumOfOddAndEven(List<Integer> integerList){
//        Normal way
//        long oddCount = integerList.stream().filter(num -> num % 2 != 0).count();
        return integerList.stream().collect(Collectors.partitioningBy(
                num -> num % 2 == 0 , Collectors.counting()
        ));
    }
}
