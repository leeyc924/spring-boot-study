package com.example.spring_boot_crud.service;
import java.util.List;

import com.example.spring_boot_crud.model.User;
import com.example.spring_boot_crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // get users data
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
