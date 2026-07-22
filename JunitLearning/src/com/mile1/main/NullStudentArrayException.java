package com.mile1.main;

public class NullStudentArrayException extends Exception {

    public NullStudentArrayException() {
        super("Student array is null");
    }

    public NullStudentArrayException(String message) {
        super(message);
    }
}