package com.example.spring_boot_crud.controller;

import com.example.spring_boot_crud.model.User;
import com.example.spring_boot_crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/tutorials")
    public ResponseEntity<List<User>> getAllTutorials(@RequestParam(required = false) String title) {
   
    }

    @GetMapping("/tutorials/{id}")
    public ResponseEntity<User> getTutorialById(@PathVariable("id") long id) {

    }

    @PostMapping("/tutorials")
    public ResponseEntity<User> createTutorial(@RequestBody User user) {

    }

    @PutMapping("/tutorials/{id}")
    public ResponseEntity<User> updateTutorial(@PathVariable("id") long id, @RequestBody User user) {

    }

    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {

    }

    @DeleteMapping("/tutorials")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {

    }

    @GetMapping("/tutorials/published")
    public ResponseEntity<List<User>> findByPublished() {

    }
}
