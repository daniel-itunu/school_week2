package com.company;

import com.company.Applicant.Applicant;
import com.company.Course.Course;
import com.company.Staff.Principal;
import com.company.Staff.Teacher;
import com.company.Student.Student;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //principal calls
        Principal principal = new Principal("Principal John");
        System.out.println("********************** principal **********************");
        System.out.println(principal.canTeach());
        System.out.println(principal.canExpel());
        System.out.println(principal.canAdmit());
        System.out.println(principal.admit(new Applicant("Paul", 7)));
        System.out.println(principal.expel(new Student("Paul")));
        System.out.println(principal.teach(new Course("Biology"))+"\n");

        //teacher calls
        System.out.println("********************** teacher **********************");
        Teacher teacher = new Teacher("Teacher John");
        System.out.println(teacher.canTeach());
        System.out.println(teacher.canExpel());
        System.out.println(teacher.canAdmit());
        System.out.println(teacher.admit(new Applicant("Paul", 7)));
        System.out.println(teacher.expel(new Student("Paul")));
        System.out.println(teacher.teach(new Course("Biology"))+"\n");

        //student calls
        System.out.println("********************** student **********************");
        Student student = new Student("John");
        System.out.println(student.getName());
        System.out.println(student.takeCourse(new Course("chemistry"))+"\n");
    }
}
