package cn.liuxingwei.spring.boot.controller;

import cn.liuxingwei.spring.boot.mapper.UserMapper;
import cn.liuxingwei.spring.boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = GET)
    public String home() {
        List<User> userList = userMapper.selectAll();
        System.out.println(userList.size());
        return "home";
    }
}
