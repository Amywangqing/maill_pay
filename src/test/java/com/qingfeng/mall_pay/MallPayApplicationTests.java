package com.qingfeng.mall_pay;

import com.qingfeng.mall_pay.dao.CategoryMapper;
import com.qingfeng.mall_pay.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallPayApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void findById() {

        Category category = categoryMapper.fingById(100001);
        System.out.println(category);
    }

}
