package com.example.mapping.Mapping.repository;

import com.example.mapping.Mapping.entity.StudentLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentloginRepository extends JpaRepository<StudentLogin, Long> {
}
