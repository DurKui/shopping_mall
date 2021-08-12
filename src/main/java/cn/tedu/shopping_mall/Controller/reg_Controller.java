package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.entity.goods;
import cn.tedu.shopping_mall.entity.notice;
import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.List;

@Controller
public class reg_Controller {
    @Resource
    XmlMapper xml;

    @GetMapping("/register")
    public String register()
    {
        return "register";
    }
    @PostMapping("/register_handle")
    public String handle(HttpServletRequest request,ServletResponse response) throws SQLException, ServletException, IOException {
        //
        boolean exist = false;
        String name = request.getParameter("uid");
        String password = request.getParameter("psw1");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        List<String> rs;
        rs=xml.findUsername(name);
        if(rs.isEmpty()==false)
        {
            exist=true;
        }
        if (exist) {

            return "redirect:register?error=yes";

        } else {
            int row= xml.insertUser(name,password,email,address);
            return "userlogin";
        }
    }


}
