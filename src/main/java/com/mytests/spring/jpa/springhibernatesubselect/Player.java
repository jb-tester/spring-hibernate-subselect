package com.mytests.spring.jpa.springhibernatesubselect;

import org.hibernate.annotations.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * *
 * <p>Created by irina on 9/10/2021.</p>
 * <p>Project: spring-hibernate-subselect</p>
 * *
 */
@Entity
@SQLDeleteAll(sql="UPDATE player SET banned = true WHERE id=?")
// https://youtrack.jetbrains.com/issue/IDEA-277980
@FilterDef(name = "bannedUsersFilter", parameters = @ParamDef(name = "showBanned", type = "boolean"))
@Filter(name = "bannedUsersFilter", condition = "banned = :showBanned")
public class Player {
    @Id
    private Integer id;
    private String name;
    private String card;
    private Integer points;
    private boolean banned;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public Player(String name, String card, Integer points) {
        this.name = name;
        this.card = card;
        this.points = points;
    }

    public Player() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCard() {
        return card;
    }

    public Integer getPoints() {
        return points;
    }

    public boolean isBanned() {
        return banned;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", card='" + card + '\'' +
                ", points=" + points +
                ", banned=" + banned +
                '}';
    }
}
