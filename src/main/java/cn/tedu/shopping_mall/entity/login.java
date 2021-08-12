package cn.tedu.shopping_mall.entity;

import java.io.Serializable;

public class login implements Serializable {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public login() {
    }
}
