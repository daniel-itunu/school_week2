package com.company;

import com.company.Course.Course;
import com.company.Staff.NonAcademicStaff.NonAcademicStaff;
import com.company.Staff.Principal.Principal;
import com.company.Staff.Teacher.Teacher;
import com.company.Student.Student;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student = new Student("John", 22,1);

        //principal calls
        Principal principal= Principal.getPrincipal();
        System.out.println("********************** principal **********************");
        System.out.println(principal.canTeach());
        System.out.println(principal.canExpel());
        System.out.println(principal.canAdmit());
        System.out.println(principal.admit(student));
        System.out.println(principal.expel(student));
        System.out.println(principal.teach(new Course("Biology"))+"\n");

        //teacher calls
        System.out.println("********************** teacher **********************");
        Teacher teacher = new Teacher("Teacher John");
        System.out.println(teacher.canTeach());
        System.out.println(teacher.canExpel());
        System.out.println(teacher.canAdmit());
        System.out.println(teacher.admit(student));
        System.out.println(teacher.expel(student));
        System.out.println(teacher.teach(new Course("Biology"))+"\n");

        //NonAcademicStaff calls
        System.out.println("********************** NonAcademicStaff **********************");
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("Thomas");
        System.out.println(nonAcademicStaff.canTeach());
        System.out.println(nonAcademicStaff.canExpel());
        System.out.println(nonAcademicStaff.canAdmit());
        System.out.println(nonAcademicStaff.admit(student));
        System.out.println(nonAcademicStaff.expel(student));
        System.out.println(nonAcademicStaff.teach(new Course("Biology"))+"\n");

        //student calls
        System.out.println("********************** student **********************");
        System.out.println(student.getName());
        System.out.println(student.takeCourse(new Course("chemistry"))+"\n");
    }
}
