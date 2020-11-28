package com.javatpoint.h2.repo;

import com.javatpoint.h2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
