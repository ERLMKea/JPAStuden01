package com.example.jpastuden01.controller;

import com.example.jpastuden01.model.Student;
import com.example.jpastuden01.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @GetMapping("/addstudent")
    public List<Student> addStudent() {
        Student std = new Student();
        std.setBornDate(LocalDate.now());
        std.setBornTime(LocalTime.now());
        List<Student> lst = studentRepository.findAll();
        std.setName("Autogenerated size=" + lst.size());
        studentRepository.save(std);
        lst = studentRepository.findAll();
        return lst;

    }


}
