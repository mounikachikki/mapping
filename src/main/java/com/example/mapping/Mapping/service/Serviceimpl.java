package com.example.mapping.Mapping.service;

import com.example.mapping.Mapping.entity.Student;
import com.example.mapping.Mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceimpl {
    @Autowired
    private StudentRepository studentRepository;

   public Student saveStudent(Student student){
       return studentRepository.save(student);
   }

}
