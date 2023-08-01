package com.mytests.spring.jpa.springhibernatesubselect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

/**
 * *
 * <p>Created by irina on 9/3/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
@Service
public class UserService {

    @Autowired UserRepository repo;
    @Autowired private EntityManager entityManager;
    public void addUser(){
        repo.save(new User(2,"masha", "goddess",3));
    }

    public List<User> getAllUsers(){
        return (List<User>) repo.findAll();
    }

    public Optional<User> getById(int id){
        return repo.findById(id);
    }

    public void deleteUser(){
        repo.deleteById(3);
    }


   /* @SqlBatch("INSERT INTO table (name, id) values (:names, :id)")
    public void addName(
            @Bind("names") List<String> names,
            @Bind("id") long id){

    }*/
}
