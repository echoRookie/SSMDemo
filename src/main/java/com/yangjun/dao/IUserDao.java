package com.yangjun.dao;

import com.yangjun.entity.User;

public interface IUserDao {
    User findUserById(int id);
}
