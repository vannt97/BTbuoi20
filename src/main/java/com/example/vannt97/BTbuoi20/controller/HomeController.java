package com.example.vannt97.BTbuoi20.controller;

import com.example.vannt97.BTbuoi20.model.Student;
import com.example.vannt97.BTbuoi20.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    StudentService studentService;

    @PostMapping("/api/add-student")
    public Object addStudent(@RequestParam("name") String name, @RequestParam("age") int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        return  studentService.getListStudent();
    }

    @PostMapping("/api/add-student-2/{name}/{age}")
    public Object addStudentUsePathVariable(@PathVariable String name, @PathVariable int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        return  studentService.getListStudent();
    }

    @PostMapping("/api/add-student-3")
    public Object addStudentUseRequestBody(@RequestBody Student student){
        studentService.addStudent(student);
        return  studentService.getListStudent();
    }
}
