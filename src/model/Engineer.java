package model;

import java.util.Objects;

public class Engineer {

    String name;
    String dept;
    int salary;
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return salary == engineer.salary && id == engineer.id && name.equals(engineer.name) && dept.equals(engineer.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dept, salary, id);
    }

    //parameterized constructor
    public Engineer(String name, String dept, int salary, int id) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.id = id;
    }
//getter and setter
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
