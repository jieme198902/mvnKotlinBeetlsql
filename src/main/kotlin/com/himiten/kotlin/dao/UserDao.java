package com.himiten.kotlin.dao;


import com.himiten.kotlin.model.User;

import java.util.List;

public interface UserDao {
   List<User> getUserListTops(Integer count);
   List<User> getUserByPhone(String phone);

}