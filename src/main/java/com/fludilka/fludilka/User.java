package com.fludilka.fludilka;

import javax.validation.constraints.Size;

public class User {

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
        return String.format("User(Nick: %s", this.nick);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
