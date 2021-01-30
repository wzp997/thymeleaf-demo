package com.wzp.controller;

import com.wzp.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
public class TestController01 {

    @RequestMapping("/index01")
    public String indexPage(Model model){
        model.addAttribute("msg","hello");
        return "index01";
    }

    @RequestMapping("/index02")
    public String index02(Model model){
        User user = new User(1, "hh", 18);
        model.addAttribute("user",user);

        HashMap<String, Object> map = new HashMap<>();
        map.put("id",2);
        map.put("name","lisi");
        map.put("age",20);
        model.addAttribute("map",map);
        return "index02";
    }

    @RequestMapping("/index03")
    public String index03(Model model){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "hh", 18));
        list.add(new User(2, "cc", 18));
        list.add(new User(3, "ll", 20));
        model.addAttribute("list",list);
        return "index03";
    }

    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("name","lisi");
        model.addAttribute("url","www.baidu.com");
        return "index04";
    }

    @RequestMapping("index05")
    public String index05(Model model){
        model.addAttribute("flag","true");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index05";
    }

    @RequestMapping("/index06")
    public String index06(Model model){
        return "index06";
    }

    @RequestMapping("/index07")
    public String index07(Model model){
        //时间
        Date date = new Date();
        model.addAttribute("date",date);
        //小数
        double price = 128.1314D;
        model.addAttribute("price",price);
        //定义大文本数据
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("text",str);
        String str2 = "hello";
        model.addAttribute("str",str2);
        return "index07";
    }
}
