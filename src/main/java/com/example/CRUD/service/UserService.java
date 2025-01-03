package com.example.CRUD.service;

import com.example.CRUD.model.User;

import java.util.List;

public interface UserService {
    public User findById(Integer id);
    public List<User> findAll();
    public User saveUser(User user);
    public void deleteById(Integer id);
}