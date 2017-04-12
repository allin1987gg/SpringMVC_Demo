package com.domain.test.controller;

import com.domain.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

/**
 * Created by zjz on 17/4/6.
 */
@Controller
public class TestController {

    @Autowired
    TestService testService;

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest httpServletRequest) {
        System.out.println("this is home");
        logger.info("xxxxxxxxxxxxxxxxxxxxxxxx");
        ModelAndView mav = new ModelAndView();

        List<Map<String, String>> map = testService.getTest();

        //===================================================================================//
//        Map<String,String> paramMap = new HashMap<String,String>();
//        paramMap.put("test","11111");
//        int i = testService.insert_Test(paramMap);
//
//        for(Map.Entry<String, String> entry : paramMap.entrySet()){
//            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
//        }
        //===================================================================================//



        mav.setViewName("home");
        return mav;
    }

    @RequestMapping(value = "/responseBodyGET", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> responseBodyGET(HttpServletRequest httpServletRequest) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("aaa","aaa");

        return map;


    }



}
