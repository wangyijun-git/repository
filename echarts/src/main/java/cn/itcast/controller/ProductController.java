package cn.itcast.controller;

import cn.itcast.pojo.Product;
import cn.itcast.service.AccountService;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/show")
    @ResponseBody
    public Map<String, Object> show(){
        return productService.findMap();
    }
}
