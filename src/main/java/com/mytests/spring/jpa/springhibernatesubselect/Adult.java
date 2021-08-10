package com.mytests.spring.jpa.springhibernatesubselect;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

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
@Subselect("select p.id as id, CONCAT_WS( ' ', p.FIRST_NAME, p.LAST_NAME )  as full_name, p.PASSPORT as passport  from PERSON p where p.AGE > 18 ")
public class Adult {

    @Id
    Integer id;
    String full_name;
    String passport;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String name) {
        this.full_name = name;
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
                ", name='" + full_name + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
