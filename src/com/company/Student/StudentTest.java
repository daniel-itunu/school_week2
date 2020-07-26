package com.company.Student;

import com.company.Course.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    private final Student student = new Student();
    private final Course course = new Course();

    @Test
    void getName() {
        student.setName("paul");
        assertEquals("paul", student.getName());
    }

    @Test
    void setName() {
        student.setName("john");
        assertEquals("john", student.getName());
    }

    @Test
    void takeCourse() {
        assertEquals("course " + course.getTitle() + "taken", student.takeCourse(course));
    }
}