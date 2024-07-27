package student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StudentDataProcessing {


    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));




//        1- Find list of students whose first name starts with alphabet A

        List<Student> studentsWithFirstNameA = list.stream()
                .filter(student -> student.getFirstName().startsWith("A"))
                .toList();


        System.out.println("List of students with name starts with A "+ studentsWithFirstNameA);

        System.out.println("=================");

        Map<String,List<Student>> mapData = StudentDataOperations.groupByDepartmentNames(list);
        System.out.println(mapData);

        System.out.println("===============");
        long count = StudentDataOperations.countOfStudent(list);
        System.out.println(count);

        System.out.println("====================");
        OptionalInt maxAge = StudentDataOperations.maxAge(list);
        System.out.println(maxAge.getAsInt());

        System.out.println("=================");
        System.out.println(StudentDataOperations.departmentNames(list));

        System.out.println("=========");
        Map<String,Long> getStudentCountOfDept = StudentDataOperations.countOfStudentsInEachDepartment(list);
        System.out.println(getStudentCountOfDept);

        System.out.println("========");
        System.out.println(StudentDataOperations.studentListLessThanThirty(list));

        System.out.println("=============");
        List<Student> students = StudentDataOperations.lstStu(list);
        System.out.println(students);

        System.out.println("================");
        Map<String,Double> avgGenderAge = StudentDataOperations.mapAvgAge(list);
        System.out.println(avgGenderAge);
    }





}
