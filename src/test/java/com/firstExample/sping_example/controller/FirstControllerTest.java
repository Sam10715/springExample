package com.firstExample.sping_example.controller;

import com.firstExample.sping_example.model.Student;
import com.firstExample.sping_example.service.StudentService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class FirstControllerTest {


    private MockMvc mockMvc;

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
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(firstController)
                .build();

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




