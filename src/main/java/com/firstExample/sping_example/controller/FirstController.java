package com.firstExample.sping_example.controller;

import com.firstExample.sping_example.model.IdCard;
import com.firstExample.sping_example.model.Student;
import com.firstExample.sping_example.respositires.StudentRepository;
import com.firstExample.sping_example.service.IdCardService;
import com.firstExample.sping_example.service.IdCardServiceImpl2;
import com.firstExample.sping_example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class FirstController {

    @Autowired
    private StudentService studentService;
    @Autowired
    @Qualifier("idCardServiceImpl")
    private IdCardService idCardService;


    @GetMapping(value = "/allstudents")
    public List<Student> getAllStudents() {

        return studentService.getStudnetAgePlus10();
    }


    @GetMapping(value = "findAll")
    public List<Student> getAll() {

        return studentService.getAllStudents();
    }

    @PostMapping()
    public Student saveStudent(Student student) {
      return   studentService.saveStudent(student);
    }

    @GetMapping(value = "/getId")
    public List<IdCard> getAllCards(){

        IdCardServiceImpl2 idCardServiceImpl2 = (IdCardServiceImpl2)idCardService;

        return idCardServiceImpl2.getAll();
    }


}
