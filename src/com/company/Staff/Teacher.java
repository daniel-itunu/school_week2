package com.company.Staff;

import com.company.Applicant.Applicant;
import com.company.Contract.Capacity;
import com.company.Course.Course;
import com.company.Student.Student;

/**
 * Teacher class is a blueprint for a taecher entity.
 * Inherits from the abstract class "staff" and implements the capacity(responsibility) interface.
 */
public class Teacher extends Staff implements Capacity {

    /**
     * Default constructor calling the parent class "staff" default constructor
     */
    public Teacher() {
        super();
    }

    /***
     * Primary constructor having name of the teacher.
     * @param name: the name of the teacher.
     */
    public Teacher(String name) {
        super(name);
    }

    /**
     * @return true since teacher has capacity to teach.
     */
    @Override
    public boolean canTeach() {
        return true;
    }

    /**
     * @return false since teacher has no capacity to expel a student.
     */
    @Override
    public boolean canExpel() {
        return false;
    }

    /**
     * @return false since teacher has no capacity to admit an applicant.
     */
    @Override
    public boolean canAdmit() {
        return false;
    }

    /**
     * @param course: the course to the taught.
     * @return a string confirming teaching capacity.
     */
    @Override
    public String teach(Course course) {
        return "teaches " + course.getTitle();
    }

    /**
     * @param applicant: the applicant to be admitted based on age which must be greater than 11.
     * @return a string confirming admission capacity/status.
     */
    @Override
    public String admit(Applicant applicant) {
        return "teacher has no capacity to admit applicant " + applicant.getName();
    }

    /**
     * @param student: the student to be expelled.
     * @return a string confirming expulsion capacity/status.
     */
    @Override
    public String expel(Student student) {
        return "teacher has no capacity to expel student " + student.getName();
    }
}
