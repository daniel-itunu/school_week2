package com.company.Staff;

import com.company.Applicant.Applicant;
import com.company.Course.Course;
import com.company.Student.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipalTest {
    private final Principal principal = new Principal();
    private final Applicant applicant = new Applicant();
    private final Course course = new Course();
    private final Student student = new Student();


    @Test
    void canTeach() {
        assertEquals(false, principal.canTeach());
    }

    @Test
    void canExpel() {
        assertEquals(true, principal.canExpel());
    }

    @Test
    void canAdmit() {
        assertEquals(true, principal.canAdmit());
    }

    @Test
    void teach() {
        assertEquals("principal has no capacity to teach course " + course.getTitle(), principal.teach(course));
    }

    @Test
    void admit() {
        if (applicant.getAge() > 11) {
            assertEquals(applicant.getName() + " admitted", principal.admit(applicant));
        }
    }

    @Test
    void expel() {
        assertEquals("Sucessfully expelled " + student.getName(), principal.expel(student));
    }
}