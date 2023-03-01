package com.example.demo.servive;

import com.example.demo.dto.Student;

public interface StudentService {
    Student getStudent(int id);

    int saveStudent(Student student);
}
