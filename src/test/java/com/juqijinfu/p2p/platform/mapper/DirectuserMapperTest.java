package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Directuser;
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
}
