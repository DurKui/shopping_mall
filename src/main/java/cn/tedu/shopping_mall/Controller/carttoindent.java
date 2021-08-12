package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class carttoindent {
    @Resource
    XmlMapper xml;
    @GetMapping("/cartpay")
    public String cartpay()
    {
        return "cartpay";
    }
    @PostMapping("/carttoindent")
    public String cartindent(HttpSession session, HttpServletRequest request, ModelMap map)
    {
        String name=(String) session.getAttribute("usnum");
        int row;
     row=xml.updatenum();
     String sum=request.getParameter("money");
     String gonum=xml.selectgonum();
     String address=xml.Selectaddress(name);
     row=xml.insertorders(gonum,name,sum,address);
     map.put("name",name);
     return "redirect:userindent";
    }
}
