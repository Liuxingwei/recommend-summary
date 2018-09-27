package cn.liuxingwei.spring.boot.controller;

import cn.liuxingwei.spring.boot.mapper.DirectAccountMapper;
import cn.liuxingwei.spring.boot.model.DirectAccount;
import cn.liuxingwei.spring.boot.model.User;
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
    private DirectAccountMapper directAccountMapper;

    @RequestMapping(method = GET)
    public String home() {
        List<DirectAccount> directAccountList = directAccountMapper.selectAll();
        System.out.println(directAccountList.size());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (DirectAccount directAccount : directAccountList) {
            System.out.print(directAccount.getId());
            System.out.print("\t\t");
            System.out.print(directAccount.getUserId());
            System.out.print("\t\t");
            System.out.println(directAccount.getBalance());
        }
        return "home";
    }
}
