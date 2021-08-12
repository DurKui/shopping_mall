package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class delroomServlet {
    @Resource
    XmlMapper xml;
    @GetMapping("/delroomServlet")
    public String delroom(HttpSession session, HttpServletRequest request)
    {
        String name=(String)session.getAttribute("usnum");
        String gonum=request.getParameter("gonum");
        int row=xml.deleteByIds(gonum,name);
        return "redirect:shopcart";
    }

}
