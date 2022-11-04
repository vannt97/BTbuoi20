package com.example.vannt97.BTbuoi20.repository;

import com.example.vannt97.BTbuoi20.model.Student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class StudentRepositoryImp implements StudentRepository{

    List<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public List<Student> getListStudent() {
        return list;
    }
}
