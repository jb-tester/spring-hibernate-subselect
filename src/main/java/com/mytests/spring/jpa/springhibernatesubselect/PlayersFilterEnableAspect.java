package com.mytests.spring.jpa.springhibernatesubselect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;

@Aspect
@Component
public class PlayersFilterEnableAspect {

    @AfterReturning(
            pointcut="bean(entityManagerFactory) && execution(* createEntityManager(..))",
            returning="retVal")
    public void getSessionAfter(JoinPoint joinPoint, Object retVal) {
        if (retVal instanceof EntityManager) {
            Session session = ((EntityManager) retVal).unwrap(Session.class);
            session.enableFilter("bannedUsersFilter").setParameter("showBanned", false);
        }
    }

}