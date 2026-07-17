import java.util.ArrayList;

class Student {

    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class StudentFilterCount {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rahul", 80));
        list.add(new Student(2, "Anu", 45));
        list.add(new Student(3, "Ravi", 67));
        list.add(new Student(4, "John", 50));
        list.add(new Student(5, "Priya", 39));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed: " + count);
    }
}