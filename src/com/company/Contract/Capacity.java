package com.company.Contract;

import com.company.Course.Course;
import com.company.Student.Student;

/**
 * interface Capacity provides various responsibilities of different staff.
 */
public interface Capacity {
    boolean canTeach();

    boolean canExpel();

    boolean canAdmit();

    String teach(Course course);

    String admit(Student student);

    String expel(Student student);
}
