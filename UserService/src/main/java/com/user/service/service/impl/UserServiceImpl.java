package com.user.service.service.impl;

import com.user.service.entity.User;
import com.user.service.repository.UserRepo;
import com.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepo userRepo;

    @Override
    public User createUser(User user) {
        String randomUserId =  UUID.randomUUID().toString();
        user.setUserID(randomUserId);
        return userRepo.save(user);

    }

    @Override
    public List<User> getAllUsers() {

        return userRepo.findAll();
    }

    @Override
    public User getUserById(String id) {

        return userRepo.findById(id).orElseThrow( ()->
                new RuntimeException("User not found with id: "+id));
    }

    @Override
    public User updateUser(User user) {

        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
