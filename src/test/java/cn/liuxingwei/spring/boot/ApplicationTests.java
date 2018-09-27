package cn.liuxingwei.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@PropertySource({"classpath:application.properties"})
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }

}
