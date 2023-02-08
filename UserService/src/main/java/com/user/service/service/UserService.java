package com.user.service.service;

import com.user.service.entity.User;

import java.util.List;

public interface UserService {

    //create
    public User createUser(User user);


    //all users
    public List<User> getAllUsers();

    //get user by id
    public User getUserById(String id);

    //update user
    public User updateUser(User user);

    //delete user
    public void deleteUser(String id);

}
