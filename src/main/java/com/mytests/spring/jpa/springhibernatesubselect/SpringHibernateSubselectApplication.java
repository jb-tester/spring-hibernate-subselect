package com.mytests.spring.jpa.springhibernatesubselect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateSubselectApplication implements CommandLineRunner {

    @Autowired private AdultsRepository adultsRepository;
    @Autowired PersonRepository personRepository;
    @Autowired UserService userService;
    @Autowired EmployeeService employeeService;
    @Autowired PlayerService playerService;

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateSubselectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (PersonEntity person : personRepository.findAll()) {
            System.out.println(person);
        }
        for (Adult adult : adultsRepository.findAll()) {
            System.out.println(adult);
        }
        userService.addUser();
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        System.out.println(userService.getById(3));

        userService.deleteUser();

        employeeService.displayStuff();
        employeeService.fireEmployee(1);
        employeeService.displayStuff();

        playerService.displayFilteredPlayers();
        playerService.deletePlayers();
        playerService.displayFilteredPlayers();
    }
}
