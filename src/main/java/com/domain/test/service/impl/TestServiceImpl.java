package com.domain.test.service.impl;

import com.domain.test.dao.TestDao;
import com.domain.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zjz on 17/4/10.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;

    public List<Map<String, String>> getTest() {
        List<Map<String, String>> result = testDao.getTest();
        return result;
    }

    public int insert_Test(Map<String, String> map) {
        int result = testDao.insert_Test(map);
        return result;
    }


}
