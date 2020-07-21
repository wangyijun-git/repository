package cn.itcast.controller;

import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/transfer")
    public String transfer(String outName, String inName, double money){
        accountService.transfer(outName, inName, money);
        return "success";
    }
}
