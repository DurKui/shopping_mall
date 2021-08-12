
package cn.tedu.shopping_mall.beans;

public class Login {
    private Integer uid;
    private String name;
    private String password;
    private String userimg;

    public Login() {
    }

    public String getUserimage() {
        return this.userimg;
    }

    public void setUserimg(String a) {
        this.userimg = a;
    }

    public Integer getId() {
        return this.uid;
    }

    public void setId(Integer id) {
        this.uid = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
