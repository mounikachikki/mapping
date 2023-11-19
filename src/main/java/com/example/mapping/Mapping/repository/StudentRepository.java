package com.example.mapping.Mapping.repository;

import com.example.mapping.Mapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
