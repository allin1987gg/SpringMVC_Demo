package com.domain.test.service;

import java.util.List;
import java.util.Map;

/**
 * Created by zjz on 17/4/10.
 */
public interface TestService {
    public List<Map<String, String>> getTest();
    public int insert_Test(Map<String,String> map);
}
