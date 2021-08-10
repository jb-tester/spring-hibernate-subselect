package com.mytests.spring.jpa.springhibernatesubselect;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.*;
// TODO: add proper tests for these annotations
@Entity
@Table(name="USER")
@SQLInsert( sql="INSERT INTO USER(rating, name, nickname, id) VALUES(?,upper(?),?,?)") @SQLUpdate( sql="UPDATE USER SET rating = ?, name = upper(?), nickname = ? WHERE id = ?") @SQLDelete( sql="DELETE USER WHERE id = ?") @SQLDeleteAll( sql="DELETE USER") @Loader(namedQuery = "user")
@NamedNativeQuery(name="user", query="select id, rating, name, lower( nickname ) as nickname from USER where id= ?", resultClass = User.class)
public class User {
    @Id
    private Long id;
    private Long rating;
    private String name;
    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
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
}    