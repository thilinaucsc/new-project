package com.example.demo.contoller;

import com.example.demo.dto.Student;
import com.example.demo.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/studentName", method = RequestMethod.GET)
    public String getStudentName() {
        return "AAAA";
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public int saveStudent(@RequestBody Student st) {
        return studentService.saveStudent(st);
    }
}
