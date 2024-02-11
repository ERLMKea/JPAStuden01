package com.example.jpastuden01.repository;

import com.example.jpastuden01.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
