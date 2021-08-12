package cn.tedu.shopping_mall.entity;

import java.io.Serializable;

public class orderbean implements Serializable {
    private String gonum;
    private String usnum;
    private String value;
    private String state;
    private String address;

    public String getGonum() {
        return gonum;
    }

    public void setGonum(String gonum) {
        this.gonum = gonum;
    }

    public String getUsnum() {
        return usnum;
    }

    public void setUsnum(String usnum) {
        this.usnum = usnum;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
