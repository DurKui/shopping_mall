package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.beans.Login;
import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class calendarController implements Serializable {
    @Resource
    XmlMapper xml;
    @GetMapping("/calendar")
    public String calendar(ModelMap map, HttpServletRequest request, HttpSession session)
    {
        String[] s,s2;
        java.util.Date a = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String time = formatter.format(a);
        Login now=(Login) request.getSession().getAttribute("login");
        Login nowuser=(Login) request.getSession().getAttribute("login");
        String name=(String)session.getAttribute("usnum");
        String days=xml.selectdays(name);
        map.put("name",name);
        map.put("days",days);
        map.put("time",time);
        return "calendar";
    }
    @PostMapping("/signController")
    public String sign(HttpSession session,ModelMap map)
    {
        String name=(String)session.getAttribute("usnum");
        int row=xml.updatedays(name);
        String days=xml.selectdays(name);
        map.put("days",days);
        return "calendar";
    }
}
