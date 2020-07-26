package com.company.Student;

import com.company.Course.Course;

public class Student {
    private String name;

    public Student() {

    }

    /***
     * Primary constructor.
     * @param name: the name of the student.
     */
    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /***
     * @param course: course to be taken by student.
     * @return String confirming course taken.
     */
    public String takeCourse(Course course) {
        return "course " + course.getTitle() + "taken";
    }
}
