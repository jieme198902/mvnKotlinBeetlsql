package com.himiten.kotlin.service;


import com.himiten.kotlin.model.User;
import java.util.List;

public interface UserService {
    List<User> getUserListTops(Integer count);
    List<User> getUserByPhone(String phone);
}
