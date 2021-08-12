package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.entity.adm;
import cn.tedu.shopping_mall.entity.goods;
import cn.tedu.shopping_mall.entity.orderbean;
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
import java.util.List;
@Controller
public class adminController implements Serializable {
    @Resource
    XmlMapper xml;
    @GetMapping("/adminmain")
    public String adminmain(HttpSession session, ModelMap map)
    {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1=sdf.format(date);
        String name=(String)session.getAttribute("usname");
        map.put("name",name);
        map.put("date",date1);
        return "adminmain";
    }
    @GetMapping("/ordermana")
    public String ordermana(HttpSession session, ModelMap map)
    {
        String name=(String)session.getAttribute("usnum");
        List<orderbean> s=xml.SelectOrder3();
        map.put("name",name);
        map.put("rs",s);
        return "ordermana";
    }
    @PostMapping("/updateindent")
    public String updateindent(ModelMap map,  HttpServletRequest request)
    {
        String no = request.getParameter("gono");
        String num = request.getParameter("usnum");
        String value = request.getParameter("value");
        String state = request.getParameter("state");
        String add = request.getParameter("usaddress");
        int row=xml.updateindent(value,state,add,no,num);
        return "redirect:ordermana";
    }
    @PostMapping("/deleteindent")
    public String deleteindent(ModelMap map,  HttpServletRequest request)
    {
        String num = request.getParameter("gono1");
        String usnum = request.getParameter("usnum");
        int row=xml.deleteindent(num,usnum);
        return "redirect:ordermana";
    }
    @GetMapping("/goodmana")
    public String goodmana(HttpSession session, ModelMap map)
    {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgood();
        map.put("rs",s);
        return "goodmana";
    }
    @PostMapping("updategood")
    public String updategood(ModelMap map,  HttpServletRequest request)
    {
        String num = request.getParameter("gonum");
        String name = request.getParameter("goname");
        String vri = request.getParameter("govri");
        String value = request.getParameter("govalue");
        String details = request.getParameter("godetails");
        String eva = request.getParameter("goeva");
        int row=xml.updategoods(name,vri,value,details,eva,num);
        return "redirect:goodmana";
    }
    @PostMapping("insertgood")
    public String insertgood(ModelMap map,  HttpServletRequest request)
    {
        String num = request.getParameter("gonum1");
        String name = request.getParameter("goname1");
        String vri = request.getParameter("govri1");
        String value = request.getParameter("govalue1");
        String details = request.getParameter("godetails1");
        String eva = request.getParameter("goeva1");
        int row=xml.insertgoods(num,name,vri,value,details,eva);
        return "redirect:goodmana";
    }
    @PostMapping("deletegood")
    public String deletegood(ModelMap map,  HttpServletRequest request)
    {
        String num = request.getParameter("gonum2");
        int row=xml.deletegoods(num);
        return "redirect:goodmana";
    }
}
