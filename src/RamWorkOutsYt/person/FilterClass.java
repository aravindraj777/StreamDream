package RamWorkOutsYt.person;

import java.util.Arrays;
import java.util.List;

public class FilterClass {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person(1,"Srikand",29),
                new Person(2,"Vishnu",33),
                new Person(3,"Arun",25)
        );

        FilterClass filterClassObj = new FilterClass();
        Person person = filterClassObj.getPersonByName(personList,"Vishnu");
        System.out.println(person);

    }

    private Person getPersonByName(List<Person> personList, String name){
        Person tempPerson = null;
        for (Person person : personList){
            if (name.equals(person.getName())){
                tempPerson = person;
            }
        }
        return tempPerson;
    }
}
