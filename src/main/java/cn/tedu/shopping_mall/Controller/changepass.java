package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class changepass {
    @Resource
    XmlMapper xml;

    @GetMapping("/userserc")
    public String userserc(ModelMap map,HttpSession session)
    {
        String name=(String)session.getAttribute("name");
        map.put("name",name);
        return "userserc";
    }
    @PostMapping("/changepass")
    public String changepass(HttpServletRequest request, HttpSession session)
    {
        String num = (String) request.getSession().getAttribute("usnum");
        String pass = request.getParameter("pass");
        String passnew = request.getParameter("passnew");
        String p=xml.selectupassword(num);
        if(p.equals(pass))
        {
            int row =xml.updatepass(passnew,num);
            return "userserc?success=yes";
        }
        else
        {
            return "redirect:userserc?error=yes";
        }
    }
}
