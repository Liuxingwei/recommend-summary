package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Directuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectuserMapperTest {

    @Autowired
    private DirectuserMapper directuserMapper;

    @Test
    public void selectAll() {
        List<Directuser> directuserList = directuserMapper.selectAll();
        assertEquals(1, directuserList.size());
    }

    @Test
    public void selectBySpreaderIdWithUserinfoAndInvestList() {
        Long spreaderId = 38L;
        List<Directuser> directuserList = directuserMapper.selectBySpreaderIdWithUserinfoAndInvestList(spreaderId);
        assertEquals(1, directuserList.size());

        Directuser directuser = directuserList.get(0);
        Long userId = 48L;
        assertEquals(userId, directuser.getUserId());
        assertEquals("hC15104413400", directuser.getUser().getName());
        Long bidId = 57L;
        assertEquals(bidId, directuser.getInvestList().get(0).getBidId());
    }
}
