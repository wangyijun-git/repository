package cn.itcast.service;

import cn.itcast.mapper.ProductMapper;
import cn.itcast.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public Map<String, Object> findMap() {
        Map<String, Object> map = new HashMap<>();
        List<String> xData = new ArrayList<>();
        List<Long> seriesData = new ArrayList<>();

        List<Product> products = productMapper.findAll();
        for (Product product : products) {
            xData.add(product.getPname());
            seriesData.add(product.getNum());
        }

        map.put("xData", xData );
        map.put("seriesData", seriesData );

        return map;
    }
}
