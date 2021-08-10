package com.mytests.spring.jpa.springhibernatesubselect;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * *
 * <p>Created by irina on 8/10/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
@Entity
@Immutable
@Subselect("select p.ID as ID, CONCAT_WS( ' ', p.FIRST_NAME, p.LAST_NAME )  as FULL_NAME, p.PASSPORT as PASSPORT  from PERSON p where p.AGE > 18")
public class Adult {

    @Id
    Integer id;
    String fullName;
    String passport;

    @Basic
    @Column(name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "id=" + id +
                ", name='" + fullName + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
