package com.company.Student;

import com.company.Course.Course;

public class Student {
    private String name;
    private int age;
    private int ID;

    /***
     * Primary constructor.
     * @param name: the name of the student.
     * @param age: the age of the student.
     * @param ID: the ID of the student.
     */
    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    /***
     * @param course: course to be taken by student.
     * @return String confirming course taken.
     */
    public String takeCourse(Course course) {
        return "course " + course.getTitle() + " taken";
    }
}
