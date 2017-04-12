package com.domain.test.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by zjz on 17/4/10.
 */
public interface TestDao {
    public List<Map<String, String>> getTest();
    public int insert_Test(Map<String,String> map);
}
