package com.company.Staff;

import com.company.Applicant.Applicant;
import com.company.Course.Course;
import com.company.Student.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeacherTest {
    private final Teacher teacher = new Teacher();
    private final Course course = new Course();
    private final Applicant applicant = new Applicant();
    private final Student student = new Student();

    @Test
    void canTeach() {
        assertEquals(true, teacher.canTeach());
    }

    @Test
    void canExpel() {
        assertEquals(false, teacher.canExpel());
    }

    @Test
    void canAdmit() {
        assertEquals(false, teacher.canExpel());
    }

    @Test
    void teach() {
        assertEquals("teaches " + course.getTitle(), teacher.teach(course));
    }

    @Test
    void admit() {
        assertEquals("teacher has no capacity to admit applicant " + applicant.getName(),
                teacher.admit(applicant));
    }

    @Test
    void expel() {
        assertEquals("teacher has no capacity to expel student " + student.getName(),
                teacher.expel(student));
    }
}