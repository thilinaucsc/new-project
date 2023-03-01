package com.example.demo.serviceIml;

import com.example.demo.dto.Student;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(int id){
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        Student student = new Student();
        if(optionalStudentEntity.isPresent()) {
            student.setId(optionalStudentEntity.get().getId());
            student.setName(optionalStudentEntity.get().getName());
            student.setAge(optionalStudentEntity.get().getAge());
        }

        return student;
    }

    @Override
    public int saveStudent(Student student){
        StudentEntity se = new StudentEntity();
        se.setAge(student.getAge());
        se.setName(student.getName());

        se = studentRepository.save(se);
        return se.getId();
    }
}
