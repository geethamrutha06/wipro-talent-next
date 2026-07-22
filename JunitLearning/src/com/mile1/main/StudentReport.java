package com.mile1.main;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (student == null) {
            throw new NullStudentException();
        }

        if (student.getName() == null) {
            throw new NullNameException();
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        for (int mark : student.getMarks()) {
            if (mark < 35) {
                return "F";
            }
        }

        return "A";
    }
}