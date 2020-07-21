package cn.itcast.service;

import cn.itcast.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper mapper;

    @Override
    public void transfer(String outName, String inName, double money) {
        mapper.transferOut(outName, money);
        // int i = 1/0;
        mapper.transferIn(inName,money );
    }
}
