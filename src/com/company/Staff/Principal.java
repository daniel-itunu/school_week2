package com.company.Staff;

import com.company.Applicant.Applicant;
import com.company.Contract.Capacity;
import com.company.Course.Course;
import com.company.Student.Student;

/**
 * Principal class models the principal entity.
 * Inherits from the abstract class "staff" and implemnents the capacity(responsibility) interface.
 */
public class Principal extends Staff implements Capacity {

    /**
     * Empty constructor calling the parent class "staff" default constructor.
     */
    public Principal() {
        super();
    }

    /***
     * Primary constructor having name of the principal.
     * @param name: the name of the principal.
     */
    public Principal(String name) {
        super(name);
    }

    /**
     * @return false since principal has no capacity to teach a student.
     */
    @Override
    public boolean canTeach() {
        return false;
    }

    /**
     * @return true since principal has the capacity to expel a student.
     */
    @Override
    public boolean canExpel() {
        return true;
    }

    /**
     * @return true since principal has the capacity to admit a new applicant.
     */
    @Override
    public boolean canAdmit() {
        return true;
    }

    /**
     * @param course: the course to the taught.
     * @return a string confirming teaching capacity.
     */
    @Override
    public String teach(Course course) {
        return "principal has no capacity to teach course " + course.getTitle();
    }

    /**
     * @param applicant: the applicant to be admitted based on age which must be greater than 11.
     * @return a string confirming admission capacity/status.
     */
    @Override
    public String admit(Applicant applicant) {
        if (applicant.getAge() > 11) {
            return applicant.getName() + " admitted";
        } else {
            return applicant.getName() + " doesn't meet required admission age";
        }
    }

    /**
     * @param student: the student to be expelled.
     * @return a string confirming expulsion capacity/status.
     */
    @Override
    public String expel(Student student) {
        return "Sucessfully expelled " + student.getName();
    }

}
