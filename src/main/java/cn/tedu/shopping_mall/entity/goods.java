package cn.tedu.shopping_mall.entity;

import java.io.Serializable;

public class goods implements Serializable {
    private String gonum;
    private String goname;
    private String gofile;
    private String govri;
    private String govalue;
    private String godetails;
    private String goeva;

    public String getGonum() {
        return gonum;
    }

    public void setGonum(String gonum) {
        this.gonum = gonum;
    }

    public String getGoname() {
        return goname;
    }

    public void setGoname(String goname) {
        this.goname = goname;
    }

    public String getGofile() {
        return gofile;
    }

    public void setGofile(String gofile) {
        this.gofile = gofile;
    }

    public String getGovri() {
        return govri;
    }

    public void setGovri(String govri) {
        this.govri = govri;
    }

    public String getGovalue() {
        return govalue;
    }

    public void setGovalue(String govalue) {
        this.govalue = govalue;
    }

    public String getGodetails() {
        return godetails;
    }

    public void setGodetails(String godetails) {
        this.godetails = godetails;
    }

    public String getGoeva() {
        return goeva;
    }

    public void setGoeva(String goeva) {
        this.goeva = goeva;
    }
}
