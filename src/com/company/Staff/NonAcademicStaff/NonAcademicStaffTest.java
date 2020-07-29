package com.company.Staff.NonAcademicStaff;

import com.company.Course.Course;
import com.company.Student.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NonAcademicStaffTest {

    @Test
    void canTeach() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        assertEquals(false, nonAcademicStaff.canTeach());
    }

    @Test
    void canExpel() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        assertEquals(false, nonAcademicStaff.canExpel());
    }

    @Test
    void canAdmit() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        assertEquals(false, nonAcademicStaff.canExpel());
    }

    @Test
    void teach() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        Course course = new Course();
        assertEquals("Non-academic staff has no capacity to teach course " + course.getTitle(), nonAcademicStaff.teach(course));
    }

    @Test
    void admit() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        Student student = new Student();
        assertEquals("Non-academic staff has no capacity to admit applicant " + student.getName(), nonAcademicStaff.admit(student));
    }

    @Test
    void expel() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        Student student = new Student();
        assertEquals("Non-academic staff has no capacity to expel student " + student.getName(), nonAcademicStaff.expel(student));
    }
}