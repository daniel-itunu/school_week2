package com.company.Staff;

/**
 * abstract class "Staff". Parent to the following classes:
 * 1. NonAcademicStaff
 * 2. Principal
 * 3. Teacher
 */

abstract class Staff {

    /**
     * Field name: name of staff.
     */
    protected String name;


    protected Staff(String name) {
        this.name = name;
    }

    protected Staff() {

    }

    /**
     * @return name of staff.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name: name of staff.
     */
    public void setName(String name) {
        this.name = name;
    }

}
