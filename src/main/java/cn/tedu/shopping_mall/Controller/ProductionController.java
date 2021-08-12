package cn.tedu.shopping_mall.Controller;

import cn.tedu.shopping_mall.entity.goods;
import cn.tedu.shopping_mall.mapper.XmlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class ProductionController {
//商品展示
    @Resource
    XmlMapper xml;

    @GetMapping("/meat")
    public String meat(ModelMap map, HttpSession session) throws ClassNotFoundException, SQLException {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgoods("禽畜肉蛋");
        map.put("rs",s);
        return "meat";
    }
    @GetMapping("/plant")
    public String plant(ModelMap map,HttpSession session) throws ClassNotFoundException, SQLException {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgoods("苗木花草");
        map.put("rs",s);
        return "plant";
    }
    @GetMapping("/noodles")
    public String noodles(ModelMap map,HttpSession session) throws ClassNotFoundException, SQLException {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgoods("粮油米面");
        map.put("rs",s);
        return "noodles";
    }
    @GetMapping("/veg")
    public String veg(ModelMap map,HttpSession session) throws ClassNotFoundException, SQLException {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgoods("蔬菜");
        map.put("rs",s);
        return "veg";
    }
    @GetMapping("/asp")
    public String asp(ModelMap map,HttpSession session) throws ClassNotFoundException, SQLException {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgoods("农副加工");
        map.put("rs",s);
        return "asp";
    }
    @GetMapping("/aqu_product")
    public String aqu_product(ModelMap map,HttpSession session) throws ClassNotFoundException, SQLException {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgoods("水产");
        map.put("rs",s);
        return "aqu_product";
    }
    @GetMapping("/fru")
    public String fru(ModelMap map,HttpSession session) throws ClassNotFoundException, SQLException {
        String name=(String)session.getAttribute("usnum");
        map.put("name",name);
        List<goods> s= xml.Selectgoods("水果");
        map.put("rs",s);
        return "fru";
    }
}
