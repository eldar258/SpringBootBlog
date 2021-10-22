package com.fludilka.fludilka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Size;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Size(min=4, max=20)
    private String nick;

    @Size(min=6, max=20)
    private String password;

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String toString() {
        return String.format("User[id=%d nick=%s password=%s]", this.id, this.nick, this.password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
