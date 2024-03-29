package model;

import java.util.Objects;

public class Employee {

    String name;
    int id;
    int salary;
    String dept;

    //hash code and equal method


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, dept);
    }

    //parameterized constructor
    public Employee(String name, int id, int salary, String dept) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
    }

    //getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
