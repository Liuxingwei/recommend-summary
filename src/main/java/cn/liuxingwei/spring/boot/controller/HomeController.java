package cn.liuxingwei.spring.boot.controller;

import cn.liuxingwei.spring.boot.mapper.DirectUserMapper;
import cn.liuxingwei.spring.boot.model.DirectUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private DirectUserMapper directUserMapper;

    @RequestMapping(method = GET)
    public String home() {
        List<DirectUser> directUserList = directUserMapper.selectAll();
        System.out.println(directUserList.size());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (DirectUser directUser : directUserList) {
            System.out.print(directUser.getId());
            System.out.print("\t\t");
            System.out.print(directUser.getUserId());
            System.out.print("\t\t");
            System.out.print(directUser.getSpreaderId());
            System.out.print("\t\t");
            System.out.println(directUser.getFirstTotalRebate());
        }
        return "home";
    }
}
