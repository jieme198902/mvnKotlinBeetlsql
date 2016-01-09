package com.himiten.kotlin.dao.impl;

import com.himiten.kotlin.dao.UserDao;
import com.himiten.kotlin.model.User;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.SQLReady;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private SQLManager sqlManager;
    public List<User> getUserListTops(Integer count) {
        SQLReady sqlReady=new SQLReady("select * from user order by id limit "+count);
        return sqlManager.execute(sqlReady,User.class);
    }

    public List<User> getUserByPhone(String phone) {
        User query=new User();
        query.setPhone(phone);
        return  sqlManager.select("user.select",User.class,query);
    }
}
