
package cn.tedu.shopping_mall.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    Connection conn = DBCon.getConn();
    PreparedStatement pstmt;

    public LoginDao() {
    }

    public Login checkLogin(String name, String password) {
        try {
            this.pstmt = this.conn.prepareStatement("select* from users where usnum=?and upassword=?");
            this.pstmt.setString(1, name);
            this.pstmt.setString(2, password);
            ResultSet rs = this.pstmt.executeQuery();
            if (rs.next()) {
                Login login = new Login();
                login.setId(rs.getInt(1));
                login.setName(rs.getString(2));
                login.setPassword(rs.getString(3));
                login.setUserimg(rs.getString(6));
                return login;
            } else {
                return null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

}
