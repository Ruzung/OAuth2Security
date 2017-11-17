package com.ruzz.mywork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruzz.mywork.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public User findById(String id);
}
