package student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDataOperations {

//    Group The Student By Department Names
    public static Map<String, List<Student>> groupByDepartmentNames(List<Student> studentList){
        return studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName));
    }
}
