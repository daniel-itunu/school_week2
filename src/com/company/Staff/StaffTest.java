package com.company.Staff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {
    private final Staff teacher = new Teacher();

    @Test
    void getName() {
        teacher.setName("paul");
        assertEquals("paul", teacher.getName());
    }

    @Test
    void setName() {
        teacher.setName("john");
        assertEquals("john", teacher.getName());
    }
}