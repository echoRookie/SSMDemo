package com.yangjun.service.impl;

import com.yangjun.dao.IUserDao;
import com.yangjun.entity.User;
import com.yangjun.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
