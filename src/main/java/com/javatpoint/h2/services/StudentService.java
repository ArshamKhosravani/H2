package com.javatpoint.h2.services;

import com.javatpoint.h2.model.Student;
import com.javatpoint.h2.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAllstudents(){
       return (ArrayList<Student>) studentRepository.findAll();
    }

    public Student findById(long id){
        return  studentRepository.findById(id).get();
    }

    public void deleteById(long id){
        studentRepository.deleteById(id);
    }
}
