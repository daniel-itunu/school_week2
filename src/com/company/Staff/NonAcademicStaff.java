package com.company.Staff;

import com.company.Applicant.Applicant;
import com.company.Contract.Capacity;
import com.company.Course.Course;
import com.company.Student.Student;

public class NonAcademicStaff extends Staff implements Capacity {
    public NonAcademicStaff(String name) {
        super(name);
    }

    public NonAcademicStaff() {

    }

    /**
     * @return false since non-academic staff has no capacity to teach.
     */
    @Override
    public boolean canTeach() {
        return false;
    }

    /**
     * @return false since non-academic staff has no capacity to expel.
     */
    @Override
    public boolean canExpel() {
        return false;
    }

    /**
     * @return false since non-academic staff has no capacity to admit.
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
        return "Non-academic staff has no capacity to teach course " + course.getTitle();
    }

    /**
     * @param applicant: the applicant to be admitted based on age which must be greater than 11.
     * @return a string confirming admission capacity/status.
     */
    @Override
    public String admit(Applicant applicant) {
        return "Non-academic staff has no capacity to admit applicant " + applicant.getName();
    }

    /**
     * @param student: the student to be expelled.
     * @return a string confirming expulsion capacity/status.
     */
    @Override
    public String expel(Student student) {
        return "Non-academic staff has no capacity to expel student " + student.getName();
    }
}
