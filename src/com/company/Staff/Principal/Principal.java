package com.company.Staff.Principal;

import com.company.Contract.Capacity;
import com.company.Course.Course;
import com.company.Staff.Staff;
import com.company.Student.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * Principal class models the principal entity.
 * Inherits from the abstract class "staff" and implements the capacity(responsibility) interface.
 */
public class Principal extends Staff implements Capacity {
    public static List<Student> list = new ArrayList<>(); //Arraylist(database) of students admitted
    public static Principal principal = new Principal();

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
     * @param student: the applicant to be admitted based on age which must be greater than 11.
     * @return a string confirming admission capacity/status.
     */
    @Override
    public String admit(Student student) {
            if (student.getAge() > 11) {
                list.add(student);
                return student.getName() + " admitted. Total student is "+list.size();
            }
            else {
            return student.getName() + " doesn't meet required admission age";
        }
    }

    /**
     * @param student: the student to be expelled.
     * @return a string confirming expulsion capacity/status.
     */
    @Override
    public String expel(Student student) {
        if (list.contains(student)) {
            list.remove(student);
            return "Successfully expelled " + student.getName() +". Total student is "+ list.size();
        } else {
            return "Student not found";
        }

    }

    /**
     * @return singleton principal instance
     */
    public static Principal getPrincipal(){
        return principal;
    }

}
