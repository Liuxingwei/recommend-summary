package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Bid;
import com.juqijinfu.p2p.platform.domain.Invest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * 投资表 mapper 单元测试类
 * @author liuxingwei
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class InvestMapperTest {

    /**
     * 自动注入投资表 mapper
     * @author liuxingwei
     */
    @Autowired
    private InvestMapper investMapper;

    @Autowired
    private BidMapper bidMapper;

    /**
     * [获取全部投资记录方法]单元测试
     * @author liuxingwei
     */
    @Test
    public void selectAll() {
        List<Invest> investList = investMapper.selectAll();
        assertEquals(303, investList.size());
    }

    /**
     * [获取指定用户的投资记录方法]单元测试
     * @author liuxingwei
     */
    @Test
    public void selectByUserIdWithBid() {
        List<Invest> investList = investMapper.selectByUserIdWithBid(3L);
        assertEquals(6, investList.size());
        Invest invest = investList.get(0);
        Long bidId = 6L;
        assertEquals(bidId, invest.getBidId());
        BigDecimal amount = new BigDecimal("400.00");
        assertEquals(amount, invest.getAmount());
        Bid bid = invest.getBid();

        assertEquals("【测试】车辆贷款", bid.getTitle());
    }
}
