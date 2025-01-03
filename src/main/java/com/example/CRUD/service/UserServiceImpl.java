package com.example.CRUD.service;

import com.example.CRUD.dao.UserDao;
import com.example.CRUD.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    private final UserDao userDao;

    public User findById(Integer id) {
        return userDao.findById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User saveUser(User user){
        return userDao.saveUser(user);
    }

    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }


}