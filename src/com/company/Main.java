package com.company;

import com.company.Applicant.Applicant;
import com.company.Course.Course;
import com.company.Staff.Principal;
import com.company.Student.Student;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //principal calls
        Principal principal = new Principal("Principal John");
        System.out.println(principal.canTeach());
        System.out.println(principal.canExpel());
        System.out.println(principal.canAdmit());
        System.out.println(principal.admit(new Applicant("Paul", 7)));
        System.out.println(principal.expel(new Student("Paul")));
        System.out.println(principal.teach(new Course("Biology")));

    }
}
