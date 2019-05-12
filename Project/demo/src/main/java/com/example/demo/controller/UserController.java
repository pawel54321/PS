package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<UserModel> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserModel getUserByIndex(@PathVariable Long id) {
        return userService.getOneUser(id);
    }

    @PostMapping("/")
    public UserModel insertNewUser(@RequestBody UserModel userModel) {
        return userService.insertNewUser(userModel);
    }

    @PutMapping("/{id}")
    public UserModel updateUser(@PathVariable Long id, @RequestBody UserModel userModel) {
        return userService.updateUserById(id, userModel);
    }
}
