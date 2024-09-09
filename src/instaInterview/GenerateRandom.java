package instaInterview;

import java.util.Random;
import java.util.stream.IntStream;

public class GenerateRandom {

    public static void main(String[] args) {

        Random random = new Random();
        IntStream integerList = random.ints();
        integerList.limit(10)
                .forEach(System.out::println);
    }
}
