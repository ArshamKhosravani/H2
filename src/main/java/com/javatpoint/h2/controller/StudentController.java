package com.javatpoint.h2.controller;

import com.javatpoint.h2.model.Student;
import com.javatpoint.h2.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getAllSudents() {
        return studentService.getAllstudents();
    }

    @GetMapping("/student/{id}")
    public Student findByid(@PathVariable long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable long id) {
        studentService.deleteById(id);
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
}
