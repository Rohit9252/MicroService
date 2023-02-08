package com.user.service.controller;


import com.user.service.entity.User;
import com.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ccreate user
      @PostMapping
      public ResponseEntity<User> createUser( @RequestBody User user){
            System.out.println("user: "+user);
          return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
      }

      // get all users
        @GetMapping("/all")
        public ResponseEntity<List<User>> getAllUsers(){

            return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
        }

        // get user by id
        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable("id")  String id){
            return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
        }


        // delete user

        @DeleteMapping("/{id}")
        public ResponseEntity<User> deleteUser(@PathVariable("id") String id){
            userService.deleteUser(id);
            return ResponseEntity.status(HttpStatus.OK).body(null);
        }







}
