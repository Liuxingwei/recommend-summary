package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Directaccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

/**
 * 用户直客推荐信息表 mapper 单元测试类
 * @author liuxingwei
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectaccountMapperTest {

    /**
     * [用户直客推荐信息表] mapper 对象自动注入
     * @author liuxingwei
     */
    @Autowired
    private DirectaccountMapper directaccountMapper;

    /**
     * [获取全部直客推荐信息方法]测试
     * @author liuxingwei
     */
    @Test
    public void selectAll() {
        List<Directaccount> directaccountList = directaccountMapper.selectAll();
        assertEquals(150, directaccountList.size());
    }

    /**
     * [获取指定用户直客信息方法]测试
     * @author liuxingwei
     */
    @Test
    public void selectByUserId() {
        Directaccount directaccount = directaccountMapper.selectByUserId(1L);
        assertEquals("zxg2530", directaccount.getDirectCode());
    }
}
