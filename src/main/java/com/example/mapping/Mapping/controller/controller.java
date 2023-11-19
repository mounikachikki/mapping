package com.example.mapping.Mapping.controller;

import com.example.mapping.Mapping.entity.student;
import com.example.mapping.Mapping.service.Serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class controller {
    @Autowired
    private Serviceimpl serviceimpl;

    @PostMapping("/savestudent")
    public ResponseEntity<student>  saveStddetails(@RequestBody student student){
        student s1 = serviceimpl.saveStudent(student);
        return new ResponseEntity<>(s1, HttpStatus.OK);

    }

}
