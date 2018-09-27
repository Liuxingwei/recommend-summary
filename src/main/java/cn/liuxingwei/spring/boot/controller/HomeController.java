package cn.liuxingwei.spring.boot.controller;

import cn.liuxingwei.spring.boot.mapper.DirectuserMapper;
import cn.liuxingwei.spring.boot.model.Directuser;
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
    private DirectuserMapper directuserMapper;

    @RequestMapping(method = GET)
    public String home() {
        List<Directuser> directuserList = directuserMapper.selectAll();
        System.out.println(directuserList.size());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Directuser directuser : directuserList) {
            System.out.print(directuser.getId());
            System.out.print("\t\t");
            System.out.print(directuser.getUserId());
            System.out.print("\t\t");
            System.out.print(directuser.getSpreaderId());
            System.out.print("\t\t");
            System.out.println(directuser.getFirstTotalRebate());
        }
        return "home";
    }
}
