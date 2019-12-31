package com.firstExample.sping_example.controller;

import com.firstExample.sping_example.model.Student;
import com.firstExample.sping_example.service.StudentService;
import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class FirstControllerTest {


    @InjectMocks
    private FirstController firstController;

    @Mock
    private StudentService studentService;

    private Student student;


    @BeforeEach
    public void studentSetup(){

        student = new Student();
        student.setAge(10);
        student.setName("Samer");
        student.setId(1);
    }

    @Test
    public void testAgePlus10() {


        List<Student> students = new ArrayList<>();

        Student student = new Student();

        student.setId(1);
        student.setName("Samer");
        student.setAge(10);

        students.add(student);

        List<Student> studentList= students.stream().map(student1 -> {student1.setAge(student1.getAge()+10);
        return student1;
        }).collect(Collectors.toList());


        when(studentService.getStudnetAgePlus10()).thenReturn(studentList);

        List<Student> students1 = firstController.getAllStudents();

        Assert.assertTrue(20==students1.get(0).getAge());


    }

    @Test
    public void testAgePlus10NothingReturn() {


        List<Student> students = new ArrayList<>();

        List<Student> studentList= null;

        when(studentService.getStudnetAgePlus10()).thenReturn(studentList);

        List<Student> students1 = firstController.getAllStudents();

        Assert.assertTrue(students1==(null));


    }


    @Test
    public void testSaveStudent(){





        when(studentService.saveStudent(student)).thenReturn(student);


        Student student1=firstController.saveStudent(student);


        Assert.assertTrue(student1.getAge()==student.getAge());




    }


}




