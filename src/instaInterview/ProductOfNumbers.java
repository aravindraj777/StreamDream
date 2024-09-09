package instaInterview;

import java.util.Arrays;
import java.util.List;

public class ProductOfNumbers {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2);
        int product = integerList.stream()
                .reduce((a,b)->a * b).get();

        System.out.println(product);
    }
}
