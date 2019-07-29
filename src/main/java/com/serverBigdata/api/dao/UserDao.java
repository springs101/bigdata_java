package com.serverBigdata.api.dao;

import com.serverBigdata.api.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author jishuai
 * Date  2019-07-26
 */
@Mapper
public interface UserDao {

    public User selectByPrimaryKey(String id);

    public List<User> select(User user);

    public int insert(User user);


    public int updateByPrimaryKey(User user);

    public List<User> selectByIds(List<String> ids);
}