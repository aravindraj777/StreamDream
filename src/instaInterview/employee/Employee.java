package instaInterview.employee;

public class Employee {

    private String employeeName;
    private double employeeSalary;

    private int age;

    public Employee(String employeeName, double employeeSalary, int age, String workLocation) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.age = age;
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", age=" + age +
                ", workLocation='" + workLocation + '\'' +
                '}';
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public int getAge() {
        return age;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    private String workLocation;
}
