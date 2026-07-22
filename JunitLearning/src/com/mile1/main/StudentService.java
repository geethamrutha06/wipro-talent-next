package com.mile1.main;

public class StudentService {

    public int findNumberOfNullMarks(Student[] students)
            throws NullStudentArrayException {

        if (students == null) {
            throw new NullStudentArrayException();
        }

        int count = 0;

        for (Student student : students) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students)
            throws NullStudentArrayException {

        if (students == null) {
            throw new NullStudentArrayException();
        }

        int count = 0;

        for (Student student : students) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students)
            throws NullStudentArrayException {

        if (students == null) {
            throw new NullStudentArrayException();
        }

        int count = 0;

        for (Student student : students) {
            if (student == null) {
                count++;
            }
        }

        return count;
    }
}