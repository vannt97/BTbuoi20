package com.example.vannt97.BTbuoi20.service;

import com.example.vannt97.BTbuoi20.model.Student;
import com.example.vannt97.BTbuoi20.repository.StudentRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentRepositoryImp studentRepositoryImp;

    @Override
    public void addStudent(Student student) {
        studentRepositoryImp.addStudent(student);
    }

    @Override
    public List<Student> getListStudent() {
        return studentRepositoryImp.getListStudent();
    }


}
