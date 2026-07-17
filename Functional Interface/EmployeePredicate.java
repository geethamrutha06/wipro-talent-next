import java.util.*;
import java.util.function.Predicate;

public class EmployeePredicate {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ravi",9000));
        list.add(new Employee(102,"Priya",15000));
        list.add(new Employee(103,"Amit",8000));
        list.add(new Employee(104,"Neha",25000));
        list.add(new Employee(105,"John",7000));

        Predicate<Employee> lowSalary =
                emp -> emp.getSalary() < 10000;

        System.out.println("Employees with Salary < 10000");

        list.stream()
                .filter(lowSalary)
                .forEach(emp -> System.out.println(emp.getName()));
    }
}