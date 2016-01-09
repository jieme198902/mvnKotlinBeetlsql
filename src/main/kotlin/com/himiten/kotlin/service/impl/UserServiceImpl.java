package com.himiten.kotlin.service.impl;


import com.himiten.kotlin.dao.UserDao;
import com.himiten.kotlin.model.User;
import com.himiten.kotlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getUserListTops(Integer count) {
        return userDao.getUserListTops(count);
    }

    public List<User> getUserByPhone(String phone) {
        return userDao.getUserByPhone(phone);
    }
}
