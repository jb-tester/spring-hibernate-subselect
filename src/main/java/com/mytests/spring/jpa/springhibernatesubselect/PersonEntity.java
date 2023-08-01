package com.mytests.spring.jpa.springhibernatesubselect;

import jakarta.persistence.*;

/**
 * *
 * <p>Created by irina on 8/10/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
@Entity
@Table(name = "PERSON", schema = "PUBLIC", catalog = "TESTDB1")
public class PersonEntity {
    private Integer id;
    private String first_name;
    private String last_name;
    private Integer age;
    private String passport;

    @Id
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String name) {
        this.first_name = name;
    }
    @Basic
    @Column(name = "LAST_NAME")
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Basic
    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "PASSPORT")
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' +
                '}';
    }
}
