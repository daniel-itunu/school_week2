package com.company.Applicant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicantTest {
    private final Applicant applicant = new Applicant();

    @Test
    void getName() {
        applicant.setName("paul");
        assertEquals("paul", applicant.getName());
    }

    @Test
    void setName() {
        applicant.setName("john");
        assertEquals("john", applicant.getName());
    }

    @Test
    void getAge() {
        applicant.setAge(13);
        assertEquals(13, applicant.getAge());
    }

    @Test
    void setAge() {
        applicant.setAge(13);
        assertEquals(13, applicant.getAge());
    }
}