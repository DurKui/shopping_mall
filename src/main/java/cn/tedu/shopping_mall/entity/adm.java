package cn.tedu.shopping_mall.entity;

import java.io.Serializable;

public class adm implements Serializable {
    private String admnum;
    private String admpass;
    private String admname;

    public String getAdmnum() {
        return admnum;
    }

    public void setAdmnum(String admnum) {
        this.admnum = admnum;
    }

    public String getAdmpass() {
        return admpass;
    }

    public void setAdmpass(String admpass) {
        this.admpass = admpass;
    }

    public String getAdmname() {
        return admname;
    }

    public void setAdmname(String admname) {
        this.admname = admname;
    }
}
