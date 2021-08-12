package cn.tedu.shopping_mall.mapper;

import cn.tedu.shopping_mall.entity.*;

import java.util.List;

public interface XmlMapper {
    List<String> findUsername(String name);
    List<login>  judgelogin(String name,String password);
    List<notice> SelectNotice();
    List<goods> Selectgoods(String vri);
    List<orderbean> SelectOrders(String name,String state);
    List<orderbean> SelectOrder(String name);
    List<shopcart> Selectshopcart(String name);
    List<goods> Selectgood();
    int insertUser(String name,String password,String email,String address);
    int updatenum();
    String Selectaddress(String name);
    String selectgonum();
    int insertorders(String gonum,String name,String sum,String address);
    int insertcollection(String name,String gonum,String govalue,String goname);
    int deleteByIds(String gonum,String name);
    String selectupassword(String num);
    int updatepass(String passnew,String num);
    List<Message> selectmessage();
    adm Selectadm(String name,String password);
    int insertann(String now,String value);
    List<orderbean> SelectOrder3();
    int updateindent(String value,String state,String add,String gonum,String usnum);
    int deleteindent(String num,String usnum);
    int updategoods(String name,String vri,String value,String details,String eva,String num);
    int insertgoods(String num,String name,String vri,String value,String details,String eva);
    int deletegoods(String num);
    String selectdays(String name);
    int updatedays(String name);
    List<messages> Selectmessages();
    }
