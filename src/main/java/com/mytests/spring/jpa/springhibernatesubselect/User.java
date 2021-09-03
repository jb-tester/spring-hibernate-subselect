package com.mytests.spring.jpa.springhibernatesubselect;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.*;

@Entity
@Table(name="USERS")
@SQLInsert( check=ResultCheckStyle.NONE, sql="INSERT INTO {h-schema}USERS (is_temp, name, nickname, rating, id) VALUES(?,upper(?),upper(?),?,?)")
@SQLUpdate( sql="UPDATE {h-schema}USERS SET is_temp = true WHERE id = ?")
@SQLDelete( sql="delete USERS where id=?")
@Loader(namedQuery = "user_by_id")
@NamedNativeQuery(name="user_by_id", query="select id, rating, lower(name) as name, lower( nickname ) as nickname, is_temp from {h-schema}USERS where id= ?", resultClass = User.class)
public class User {
    @Id
    private Integer id;
    private Integer rating;
    private String name;
    private String nickname;
    private boolean is_temp;

    public boolean isTemp() {
        return is_temp;
    }

    public void setIsTemp(boolean is_temp) {
        this.is_temp = is_temp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User(Integer rating, String name, String nickname,Integer id) {
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.nickname = nickname;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", rating=" + rating +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", is_temp=" + is_temp +
                '}';
    }
}