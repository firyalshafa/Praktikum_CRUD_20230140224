package com.deploy.praktikum1.repository;

import com.deploy.praktikum1.model.entity.User;  // ✅ Ganti import ini
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}