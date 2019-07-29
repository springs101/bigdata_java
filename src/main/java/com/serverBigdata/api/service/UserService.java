package com.serverBigdata.api.service;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.serverBigdata.api.dao.UserDao;
import com.serverBigdata.api.entity.User;

import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author jishuai
 * Date  2019-07-26
 * 注意:
 *       1. 如果需要时使用事务，请在service层方法上添加@Transactional(rollbackFor = Exception.class)
 *       2. 如果需要在sevice层使用try catch， 那么请在catch中显示的抛出异常，throw new Exception();
 *
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    
    public User selectByPrimaryKey(String id) throws Exception{
        return userDao.selectByPrimaryKey(id);
    }
    
    public PageInfo selectPage(User user) throws Exception{
        Integer page = user.getPage();
        Integer limit = user.getLimit();
        if(page != null && limit != null){
            PageHelper.startPage(page, limit);
        }else{
            PageHelper.startPage(1, 20);
        }
        List<User> users = userDao.select(user);
        return new PageInfo(users);
    }
    
    public List<User> select(User user) throws Exception{
        return userDao.select(user);
    }

    
    public int insert(User user) throws Exception{
        return userDao.insert(user);
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void insertBatch(List<User> users) throws Exception{
        SqlSession session = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        UserDao userDao_ = session.getMapper(UserDao.class);
        for (int i = 0; i < users.size(); i++) {
            userDao_.insert(users.get(i));
            if(i%1000==999){//每1000条提交一次防止内存溢出
                session.commit();
                session.clearCache();
            }
        }
        session.commit();
        session.clearCache();
    }
    
    public int updateByPrimaryKey(User user) throws Exception{
        return userDao.updateByPrimaryKey(user);
    }
    
    
    public List<User> selectByIds(List<String> ids) throws Exception{
        return userDao.selectByIds(ids);
    }


}
