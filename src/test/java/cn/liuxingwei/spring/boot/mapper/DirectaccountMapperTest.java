package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Directaccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectaccountMapperTest {
    @Autowired
    private DirectaccountMapper directaccountMapper;

    @Test
    public void selectAll() {
        List<Directaccount> directaccountList = directaccountMapper.selectAll();
        assertEquals(150, directaccountList.size());
    }

    @Test
    public void selectByUserId() {
        Directaccount directaccount = directaccountMapper.selectByUserId(1L);
        assertEquals("zxg2530", directaccount.getDirectCode());
    }
}
