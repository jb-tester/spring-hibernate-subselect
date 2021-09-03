package com.mytests.spring.jpa.springhibernatesubselect;

import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * *
 * <p>Created by irina on 9/3/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
