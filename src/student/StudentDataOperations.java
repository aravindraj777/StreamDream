package student;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StudentDataOperations {

//    Group The Student By Department Names
    public static Map<String, List<Student>> groupByDepartmentNames(List<Student> studentList){
        return studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName));
    }

//     Find the total count of student using stream
    public static long countOfStudent(List<Student> studentList){
        return studentList.size();
    }

//    Find the max age of student
    public static OptionalInt maxAge (List<Student> studentList){
        return studentList.stream().mapToInt(Student::getAge).max();
    }

    public static List<String> departmentNames(List<Student> studentList){
        return studentList.stream().map(Student::getDepartmentName).distinct()
                          .collect(Collectors.toList());
    }

//    Find the count of student in each department
    public static Map<String,Long> countOfStudentsInEachDepartment(List<Student> studentList){
        return studentList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getDepartmentName,
                                Collectors.counting())
                );
    }

//    Find the list of students whose age is less than 30
    public static List<Student> studentListLessThanThirty(List<Student> studentList){
        return studentList.stream().filter(student -> student.getAge() < 30).collect(Collectors.toList());
    }


}
