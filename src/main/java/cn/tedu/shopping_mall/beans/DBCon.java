//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.tedu.shopping_mall.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
    public static Connection conn;

    public DBCon() {
    }

    public static Connection getConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root", "root");
        } catch (Exception var1) {
            var1.printStackTrace();
        }

        return conn;
    }

    public static void CloseConn() {
        try {
            conn.close();
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Connection conn = getConn();
        if (conn != null) {
            System.out.println("数据库连接正常");
        } else {
            System.out.println("数据库连接失败");
        }

    }
}
