package com.nada.series.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nada.series.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String username);
}