package cn.tedu.shopping_mall.Controller;


import cn.tedu.shopping_mall.beans.Login;
import cn.tedu.shopping_mall.beans.LoginDao;
import cn.tedu.shopping_mall.entity.adm;
import cn.tedu.shopping_mall.entity.login;
import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class login_Controller {
    @Resource
    XmlMapper xml;
    @GetMapping("/index")
    public String index(HttpSession session, ModelMap map)
    {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        return "index";
    }
    @GetMapping("/userlogin")
    public String userlogin()
    {
        return "userlogin";
    }
    @PostMapping("/userlogin_handle")
    public String handle(HttpServletRequest request, HttpSession session)
    {
        String username=request.getParameter("uid");
        String password=request.getParameter("psw1");
        List<login> rs=xml.judgelogin(username,password);
        LoginDao loginDao = new LoginDao();
        Login l = (Login)session.getAttribute("login");
        if (l == null) {
            l = loginDao.checkLogin(request.getParameter("uid"), request.getParameter("psw1"));
        }
        session.setAttribute("login",l);
        if(rs.isEmpty()==true)
        {
            return "redirect:userlogin?error=yes";
            //response.sendRedirect("userlogin?error=yes");
        }
        else {
            session.setAttribute("usnum", username);
            return "redirect:index";
        }
    }

    @GetMapping("/adminlogin")
    public String adminlogin()
    {
        return "adminlogin";
    }
    @PostMapping("/adminlogin_handle")
    public String adm_handle(HttpServletRequest request,ModelMap map,HttpSession session)
    {
        String name= request.getParameter("uid");
        String password = request.getParameter("psw1");
        adm p= xml.Selectadm(name,password);
        if(p!=null)
        {
            session.setAttribute("usnum", name);
            session.setAttribute("usname", p.getAdmname());
            return "redirect:adminmain";
        }
        else
        {
            return "redirect:adminlogin?error=yes";
        }
    }

}
