package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(11,2,4,5,6,4,3,22,2,3);
        System.out.println("First element is "+ findFirstElement(integerList).get());
    }

    private static Optional<Integer> findFirstElement(List<Integer> integerList){
        return integerList.stream()
                .findFirst();
    }
}
