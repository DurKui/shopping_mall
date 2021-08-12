//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.tedu.shopping_mall.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class resultBean {
    String[] columnName;
    String[][] tableRecord = null;

    public resultBean() {
        this.tableRecord = new String[1][1];
        this.columnName = new String[1];
    }

    public void setTableRecord(String[][] s) {
        this.tableRecord = s;
    }

    public String[][] getTableRecord() {
        return this.tableRecord;
    }

    public void setColumnName(String[] s) {
        this.columnName = s;
    }

    public String[] getColumnName() {
        return this.columnName;
    }

    public ResultSet selectReplyByMessageId(String messageid) {
        ResultSet end = null;
        String sql = "select * from messages where id=" + messageid;
        Connection con = DBCon.getConn();

        try {
            Statement st = con.createStatement(1005, 1007);
            end = st.executeQuery(sql);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return end;
    }

    public ResultSet selectdateById(String s) {
        ResultSet end = null;
        String sql = "select * from users where usnum='" + s + "'";
        Connection con = DBCon.getConn();

        try {
            Statement st = con.createStatement(1005, 1007);
            end = st.executeQuery(sql);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return end;
    }
}
