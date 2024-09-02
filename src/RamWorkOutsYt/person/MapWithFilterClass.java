package RamWorkOutsYt.person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapWithFilterClass {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1,"Srikand",29),
                new Person(2,"Vishnu",33),
                new Person(3,"Arun",25)
        );

        List<String> agedEmployees = personList.stream()
                .filter(person -> person.getAge() > 25)
                .map(Person::getName).toList();
        System.out.println("Employees having age greater that 25 are "+ agedEmployees);

        List<Person> increaseTheAge = personList.stream()
                .filter(person -> person.getAge() > 25)
                .map(person -> new Person(person.getId(),person.getName(), person.getAge()) ).toList();

        System.out.println("25 + aged people details "+ increaseTheAge);
    }
}
