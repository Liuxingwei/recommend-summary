package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectAll() {
        List<User> userList = userMapper.selectAll();
        assertEquals(1374, userList.size());
    }

}
