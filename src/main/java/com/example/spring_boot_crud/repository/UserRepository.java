package com.example.spring_boot_crud.repository;

import java.util.List;
import com.example.spring_boot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByPublished(boolean published);

    List<User> findByTitleContaining(String title);
}