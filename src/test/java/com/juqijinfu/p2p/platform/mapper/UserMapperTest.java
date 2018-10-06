package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

/**
 * 用户表 mapper 单元测试类
 * @author liuxingwei
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    /**
     * 用户表 mapper 对象注入
     * @author liuxingwei
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * [获取全部用户记录方法]单元测试
     * @author liuxingwei
     */
    @Test
    public void selectAll() {
        List<User> userList = userMapper.selectAll();
        assertEquals(1374, userList.size());
    }

    /**
     * [获取全部用户记录及其直客推荐信息方法]单元测试
     * @author liuxingwei
     */
    @Test
    public void selectAllWithDirect() {
        List<User> userList = userMapper.selectAllWithDirect();
        User user = userList.get(0);
        assertEquals(1374, userList.size());
        assertEquals("zxg2530", user.getDirectaccount().getDirectCode());
    }

    /**
     * [获取指定用户列表中用户记录及其直客推荐信息方法]的测试
     * @author liuxingwei
     */
    @Test
    public void selectByIdsWithDirect() {
        Long[] ids = {1L, 2L, 3L, 4L, 5L};
        List<User> userList = userMapper.selectByIdsWithDirect(ids);
        assertEquals(5, userList.size());
        assertEquals("zxg2530", userList.get(0).getDirectaccount().getDirectCode());
    }

    /**
     * [获取全部用户记录及其投资信息子列表方法]的测试
     * @author liuxingwei
     */
    @Test
    public void selectAllWithInvest() {
        List<User> userList = userMapper.selectAllWithInvest();
        assertEquals(1374, userList.size());
        assertEquals(21, userList.get(1).getInvestList().size());
    }

    /**
     * [获取用户列表中全部用户记录及其投资信息子列表方法]的测试
     * @author liuxingwei
     */
    @Test
    public void selectByIdsWithInvest() {
        Long[] ids = {1L, 2L, 3L, 4L, 5L};
        List<User> userList = userMapper.selectByIdsWithInvest(ids);
        assertEquals(5, userList.size());
        assertEquals(21, userList.get(1).getInvestList().size());
    }
}
