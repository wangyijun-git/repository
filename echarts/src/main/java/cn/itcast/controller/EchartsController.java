package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EchartsController {
    /*@RequestMapping("/EChartsDemo1")
    public ModelAndView EChartsDemo1(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("WEB-INF/jsp/EChartsDemo1.jsp");
        return mv;
    }*/

    @RequestMapping("/EChartsDemo1")
    public String EChartsDemo1(){
        return "EChartsDemo1";
    }
}
