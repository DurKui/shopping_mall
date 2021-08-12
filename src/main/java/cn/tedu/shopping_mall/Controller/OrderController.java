package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.entity.orderbean;
import cn.tedu.shopping_mall.entity.shopcart;
import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    XmlMapper xml;

    @GetMapping("/delivered")
    public ModelAndView deliver(HttpSession session) throws SQLException {
        ModelAndView mv=new ModelAndView("deliver");
        String name=(String)session.getAttribute("usnum");
        List<orderbean> s=xml.SelectOrders(name,"已发货");
        //  System.out.println(s);
        mv.addObject("rs",s);
        mv.addObject("name",name);
        return mv;
    }

    @GetMapping("/redeliver")
    public ModelAndView reliver(HttpSession session) throws SQLException {
        ModelAndView mv=new ModelAndView("reliver");
        String name=(String)session.getAttribute("usnum");
        List<orderbean> s=xml.SelectOrders(name,"未发货");
        mv.addObject("rs",s);
        mv.addObject("name",name);
        return mv;
    }

    @GetMapping("/userindent")
    public ModelAndView userident(HttpSession session) throws SQLException {
        ModelAndView mv=new ModelAndView("userindent");
        String name=(String)session.getAttribute("usnum");
        List<orderbean> s=xml.SelectOrder(name);
        mv.addObject("rs",s);
        mv.addObject("name",name);
        return mv;
    }


}
