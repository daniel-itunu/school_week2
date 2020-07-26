package com.company.Course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {
    private final Course course = new Course();

    @Test
    void getTitle() {
        course.setTitle("biology");
        assertEquals("biology", course.getTitle());
    }

    @Test
    void setTitle() {
        course.setTitle("chemistry");
        assertEquals("chemistry", course.getTitle());
    }
}