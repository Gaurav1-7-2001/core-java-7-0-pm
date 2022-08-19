package model;

import java.util.Objects;

public class Doctor {

    String name;
    String dept;
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && Objects.equals(name, doctor.name) && Objects.equals(dept, doctor.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dept, id);
    }

    //parameterized constructor
    public Doctor(String name, String dept, int id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    //make getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
