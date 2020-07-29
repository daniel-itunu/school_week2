package com.company.Staff.Principal;

import com.company.Course.Course;
import com.company.Student.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipalTest {

    @Test
    void canTeach() {
        Principal principal = Principal.getPrincipal();
        assertEquals(false, principal.canTeach());
    }

    @Test
    void canExpel() {
        Principal principal = Principal.getPrincipal();
        assertEquals(true, principal.canExpel());
    }

    @Test
    void canAdmit() {
        Principal principal = Principal.getPrincipal();
        assertEquals(true, principal.canAdmit());
    }

    @Test
    void teach() {
        Principal principal = Principal.getPrincipal();
        Course course = new Course();
        assertEquals("principal has no capacity to teach course " + course.getTitle(), principal.teach(course));
    }

    @Test
    void admit() {
        Principal principal = Principal.getPrincipal();
        Student student = new Student("John",23,1);
        if (student.getAge() > 11) {
            assertEquals(student.getName() + " admitted. Total student is 1", principal.admit(student));
        } else {
            assertEquals(student.getName() + " doesn't meet required admission age", principal.admit(student));
        }
    }

    @Test
    void expel() {
        Principal principal = Principal.getPrincipal();
        Student student = new Student("John", 22,1);
        if (Principal.list.contains(student)) {
            assertEquals("Successfully expelled " + student.getName() +". Total student is "+ principal.list.size(), principal.expel(student));
        } else {
            assertEquals("Student not found", principal.expel(student));
        }

    }
}