package cn.tedu.shopping_mall.Controller;


import cn.tedu.shopping_mall.entity.shopcart;
import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class addcarServlet {
    @Resource
    XmlMapper xml;

    @GetMapping("/addcarServlet")
    public String addcarServlet(HttpServletRequest request, HttpSession session)
    {
        String gonum = request.getParameter("gonum");
        String govalue = request.getParameter("govalue");
        String goname = request.getParameter("goname");
        String name = (String)session.getAttribute("usnum");
        String address=xml.Selectaddress(name);
        gonum.trim();
        int row=xml.insertcollection(name,gonum,govalue,goname);
        return "redirect:shopcart";
    }
    @GetMapping("/shopcart")
    public ModelAndView shopcart(HttpSession session) throws SQLException {
        String name=(String)session.getAttribute("usnum");
        ModelAndView mv=new ModelAndView("shopcart");
        List<shopcart> s=xml.Selectshopcart(name);
        mv.addObject("r",s);
        mv.addObject("name",name);
        return mv;
    }
}
