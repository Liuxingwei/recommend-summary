package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectAll() {
        List<User> userList = userMapper.selectAll();
        assertEquals(1374, userList.size());
    }

    @Test
    public void selectAllWithDirect() {
        List<User> userList = userMapper.selectAllWithDirect();
        User user = userList.get(0);
        assertEquals(1374, userList.size());
        assertEquals("zxg2530", user.getDiretaccount().getDirectCode());
    }

    @Test
    public void selectByIdsWithDirect() {
        Long[] ids = {1L, 2L, 3L, 4L, 5L};
        List<User> userList = userMapper.selectByIdsWithDirect(ids);
        assertEquals(5, userList.size());
        assertEquals("zxg2530", userList.get(0).getDiretaccount().getDirectCode());
    }
}
