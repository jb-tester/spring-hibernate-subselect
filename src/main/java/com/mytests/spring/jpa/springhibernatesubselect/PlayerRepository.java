package com.mytests.spring.jpa.springhibernatesubselect;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/10/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
public interface PlayerRepository extends CrudRepository<Player,Integer> {
    @Query(value = "SELECT avg(points) FROM Player where banned=false or points<1000")
    Integer findAveragePoints();

    List<Player> findByPointsGreaterThan(Integer points);
}
