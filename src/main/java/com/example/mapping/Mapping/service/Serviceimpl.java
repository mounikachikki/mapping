package com.example.mapping.Mapping.service;

import com.example.mapping.Mapping.entity.student;
import com.example.mapping.Mapping.repository.StudentRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceimpl {
    @Autowired
    private StudentRepository studentRepository;

   public student saveStudent(student student){
       return studentRepository.save(student);
   }

}
