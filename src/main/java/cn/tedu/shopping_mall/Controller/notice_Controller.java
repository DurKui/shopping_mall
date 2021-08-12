package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.entity.notice;
import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class notice_Controller {
    @Resource
    XmlMapper xml;
    @GetMapping("/useran")
    public String notice(ModelMap map, HttpSession session) throws ClassNotFoundException, SQLException {

        List<notice> rs= xml.SelectNotice();
        map.put("rs",rs);
        String name= (String)session.getAttribute("usnum");
        map.put("name",name);
        return "useran";
    }
    @GetMapping("/ann")
    public String adm_notice(ModelMap map, HttpSession session) throws ClassNotFoundException, SQLException {

        List<notice> rs= xml.SelectNotice();
        map.put("rs",rs);
        String name= (String)session.getAttribute("usnum");
        map.put("name",name);
        return "ann";
    }
    @PostMapping("/ann_handle")
    public String ann_handle(HttpServletRequest request)
    {
        java.util.Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = df.format(d);
        String value=request.getParameter("val");
        int row= xml.insertann(now,value);
        return "redirect:ann";
    }
}
