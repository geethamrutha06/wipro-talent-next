package com.mile1.main;

public class NullNameException extends Exception {

    public NullNameException() {
        super("Student name is null");
    }

    public NullNameException(String message) {
        super(message);
    }
}