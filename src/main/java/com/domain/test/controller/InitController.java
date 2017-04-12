package com.domain.test.controller;

import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * Created by zjz on 2017/4/7.
 */
@Controller
public class InitController {

    //启动服务器 初始化
    @PostConstruct
    private void init() throws IOException {
        System.out.println("InitController.init()");
    }
}
