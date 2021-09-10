package com.mytests.spring.jpa.springhibernatesubselect;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/10/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private EntityManager entityManager;

    public void addPlayer(){

    }
    public void deletePlayers(){
        int criteria = playerRepository.findAveragePoints();
        System.out.println("**********************************");
        System.out.println(criteria);

        List<Player> loosers = playerRepository.findByPointsGreaterThan(criteria);
        System.out.println("to be banned: "+loosers);
        System.out.println("**********************************");
        playerRepository.deleteAll(loosers);
    }
    public void displayFilteredPlayers(){
        
        System.out.println("======all players: ");
        for (Player player : playerRepository.allPlayers()) {
            System.out.println(player);
        }
        System.out.println("=====");
      
    }

}
