package cn.tedu.shopping_mall.beans;

import java.util.Vector;

public class user {
    Vector<String> v = new Vector<String>(); 	// 留言人
    String name = "";
    String title = "";	//标题
    String a = "";		//内容
    String s;

    int i = 0;

    public void setname(String a) {
        name = a;
    }

    public String getname() {
        return name;
    }

    public void settitle(String b) {
        title = b;
    }

    public String gettitle() {
        return title;
    }

    public void seta(String n) {
        a = n;
    }

    public String geta() {
        return a;
    }

    public void sets() {
        s = name + "#" + title + "#" + a;
        i++;
    }

    public String gets() {
        return s;
    }

    public void setv() {
        v.add("No." + i + "," + s);
    }

    public Vector<String> getv() {
        return v;
    }
}
