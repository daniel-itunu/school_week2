package com.company.Staff;

import com.company.Applicant.Applicant;
import com.company.Course.Course;
import com.company.Student.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonAcademicStaffTest {
    private final NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
    private final Course course = new Course();
    private final Applicant applicant = new Applicant();
    private final Student student = new Student();


    @Test
    void canTeach() {
        assertEquals(false, nonAcademicStaff.canTeach());
    }

    @Test
    void canExpel() {
        assertEquals(false, nonAcademicStaff.canExpel());
    }

    @Test
    void canAdmit() {
        assertEquals(false, nonAcademicStaff.canExpel());
    }

    @Test
    void teach() {
        assertEquals("Non-academic staff has no capacity to teach course " + course.getTitle(), nonAcademicStaff.teach(course));
    }

    @Test
    void admit() {
        assertEquals("Non-academic staff has no capacity to admit applicant " + applicant.getName(),
                nonAcademicStaff.admit(applicant));
    }

    @Test
    void expel() {
        assertEquals("Non-academic staff has no capacity to expel student " + student.getName(),
                nonAcademicStaff.expel(student));
    }
}