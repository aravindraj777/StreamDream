package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(11,2,4,5,6,4,3,22,2,3);
        System.out.println("First element is "+ findFirstElement(integerList).get());
        System.out.println("Count of elements is  "+ findCountOfElements(integerList));
        System.out.println("Maximum amount is "+ findMaximum(integerList).get());
    }

    private static Optional<Integer> findFirstElement(List<Integer> integerList){
        return integerList.stream()
                .findFirst();
    }

    private static long findCountOfElements(List<Integer> integerList){

        return integerList.size();
    }

    private static Optional<Integer> findMaximum(List<Integer> integerList){
      return   integerList.stream()
                .max(Integer::compare);
    }
}
