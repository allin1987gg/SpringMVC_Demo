package com.domain.test.dao.impl;

import com.domain.test.dao.TestDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zjz on 17/4/10.
 */
@Repository
public class TestDaoImpl implements TestDao {

    @Autowired
    @Resource(name="TEST")
    private SqlSession sqlSession;


    public List<Map<String, String>> getTest() {
        TestDao testDao = sqlSession.getMapper(TestDao.class);
        List<Map<String, String>> result = testDao.getTest();
        return result;
    }

    public int insert_Test(Map<String,String> map) {
        TestDao testDao = sqlSession.getMapper(TestDao.class);
        int result = testDao.insert_Test(map);
        return result;
    }
}
