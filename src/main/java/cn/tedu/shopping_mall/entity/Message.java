package cn.tedu.shopping_mall.entity;

import java.io.Serializable;

public class Message implements Serializable {
    private String name;
    private String time;
    private String message;
    private int id;
    private String []s;
    private  String [][]s2=new String[100][];
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getS() {
        return s;
    }

    public void setS(String[] s) {
        this.s = s;
    }

    public String[][] getS2() {
        return s2;
    }

    public void setS2(String[][] s2) {
        this.s2 = s2;
    }
}
