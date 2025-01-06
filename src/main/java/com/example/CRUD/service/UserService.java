package com.example.CRUD.service;

import com.example.CRUD.model.User;

import java.util.List;

public interface UserService {
    public User findById(Long id);
    public List<User> findAll();
    public void saveUser(User user);
    public void deleteById(Long id);
}