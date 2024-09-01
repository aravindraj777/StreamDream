package RamWorkOutsYt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringNames {

    public static void main(String[] args) {


//        Filtering the names starts with s
        List<String> namesList = Arrays.asList("Saravanan", "Sonu","Aravind", "Arun","Sreekanth");
        List<String> filteredList = namesList.stream()
                .filter(names -> names.startsWith("S")).toList();

        filteredList.forEach(System.out::println);
    }



}
