package com.example.demo.service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers() {

        return userRepository.findAll();
    }

    public UserModel getOneUser(Long id) {

        return userRepository.findById(id).orElse(null);
    }

    public UserModel insertNewUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Transactional
    public UserModel updateUserById(Long id, UserModel userModel) {
        UserModel model = getOneUser(id);
        model.setUser_name(userModel.getUser_name());
        model.setUser_cost(userModel.getUser_cost());
        return model;
    }
}
