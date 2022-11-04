package com.example.vannt97.BTbuoi20.repository;

import com.example.vannt97.BTbuoi20.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {

    public void addStudent(Student student);

    public List<Student> getListStudent();
}
