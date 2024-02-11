package com.example.jpastuden01.config;

import com.example.jpastuden01.model.Student;
import com.example.jpastuden01.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Bruce");
        s1.setBornDate(LocalDate.of(2002, 10, 12));
        s1.setBornTime(LocalTime.of(10, 11, 12));
        studentRepository.save(s1);

    }
}
