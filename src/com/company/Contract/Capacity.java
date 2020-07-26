package com.company.Contract;

import com.company.Applicant.Applicant;
import com.company.Course.Course;
import com.company.Student.Student;

public interface Capacity {
    boolean canTeach();

    boolean canExpel();

    boolean canAdmit();

    String teach(Course course);

    String admit(Applicant applicant);

    String expel(Student student);
}
