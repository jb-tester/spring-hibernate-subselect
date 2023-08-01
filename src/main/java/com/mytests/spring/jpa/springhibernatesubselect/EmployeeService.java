package com.mytests.spring.jpa.springhibernatesubselect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

/**
 * *
 * <p>Created by irina on 9/3/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
@Service
public class EmployeeService {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    EmployeeRepository repo;

    public void fireEmployee(int id){
        System.out.println("fire " + repo.findById(id).get().getName());
        repo.deleteById(id);
    }
    public void displayStuff(){
        for (Employee employee : repo.findAll()) {
            System.out.println(employee);
        }
    }
}
