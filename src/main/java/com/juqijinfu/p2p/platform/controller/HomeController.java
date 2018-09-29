package com.juqijinfu.p2p.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
