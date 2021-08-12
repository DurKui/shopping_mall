package cn.tedu.shopping_mall.entity;

import java.io.Serializable;

public class shopcart implements Serializable {
    private String username;
    private String gonum;
    private int govalue;
    private String goname;
    private int gocount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGonum() {
        return gonum;
    }

    public void setGonum(String gonum) {
        this.gonum = gonum;
    }

    public int getGovalue() {
        return govalue;
    }

    public void setGovalue(int govalue) {
        this.govalue = govalue;
    }

    public int getGocount() {
        return gocount;
    }

    public void setGocount(int gocount) {
        this.gocount = gocount;
    }

    public String getGoname() {
        return goname;
    }

    public void setGoname(String goname) {
        this.goname = goname;
    }
}
