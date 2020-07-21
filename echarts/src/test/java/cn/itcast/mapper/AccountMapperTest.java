package cn.itcast.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mybatis.xml")
public class AccountMapperTest {
    @Autowired
    AccountMapper mapper;

    @Test
    public void transferOut() {
        mapper.transferOut("aaa", 200);
    }

    @Test
    public void transferIn() {
        mapper.transferIn("aaa", 200 );
    }
}