package com.mytests.spring.jpa.springhibernatesubselect;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@SQLDelete(sql = "UPDATE employee SET fired = true WHERE id=?")
@Where(clause = "fired=false")  // https://youtrack.jetbrains.com/issue/IDEA-277457
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int salary;

    private boolean fired = Boolean.FALSE;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isFired() {
        return fired;
    }

    public Employee(String name, int salary, boolean fired) {
        this.name = name;
        this.salary = salary;
        this.fired = fired;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", fired=" + fired +
                '}';
    }
}