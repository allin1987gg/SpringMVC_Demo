package com.domain.test.job;

import com.domain.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zjz on 17/4/12.
 */
public class TimedTask {

    @Autowired
    TestService testService;

    public void execute() {
        // 执行业务逻辑
        // ........
        System.out.println("定时任务.......");
//        List<Map<String, String>> map = testService.getTest();
    }
}
