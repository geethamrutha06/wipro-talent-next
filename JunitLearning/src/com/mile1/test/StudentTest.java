package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.main.NullMarksArrayException;
import com.mile1.main.NullNameException;
import com.mile1.main.NullStudentArrayException;
import com.mile1.main.NullStudentException;
import com.mile1.main.Student;
import com.mile1.main.StudentReport;
import com.mile1.main.StudentService;

public class StudentTest {

    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("John", new int[] {90, 80, 70});
        StudentReport report = new StudentReport();
        assertEquals("A", report.validate(s));
    }

    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Ram", new int[] {90, 20, 70});
        StudentReport report = new StudentReport();
        assertEquals("F", report.validate(s));
    }

    @Test(expected = NullStudentException.class)
    public void testNullStudent() throws Exception {
        StudentReport report = new StudentReport();
        report.validate(null);
    }

    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {
        Student s = new Student(null, new int[] {90, 80, 70});
        StudentReport report = new StudentReport();
        report.validate(s);
    }

    @Test(expected = NullMarksArrayException.class)
    public void testNullMarks() throws Exception {
        Student s = new Student("John", null);
        StudentReport report = new StudentReport();
        report.validate(s);
    }

    @Test
    public void testFindNullNames() throws NullStudentArrayException {
        Student[] students = {
            new Student("John", new int[] {90, 80, 70}),
            new Student(null, new int[] {50, 60, 70}),
            new Student(null, new int[] {40, 50, 60})
        };

        StudentService service = new StudentService();
        assertEquals(2, service.findNumberOfNullNames(students));
    }

    @Test
    public void testFindNullObjects() throws NullStudentArrayException {
        Student[] students = {
            new Student("John", new int[] {90, 80, 70}),
            null,
            null
        };

        StudentService service = new StudentService();
        assertEquals(2, service.findNumberOfNullObjects(students));
    }

    @Test
    public void testFindNullMarks() throws NullStudentArrayException {
        Student[] students = {
            new Student("John", new int[] {90, 80, 70}),
            new Student("Ram", null),
            new Student("Sam", null)
        };

        StudentService service = new StudentService();
        assertEquals(2, service.findNumberOfNullMarks(students));
    }
}