package com.cos.blog.repository;

import com.cos.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//DAO
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
