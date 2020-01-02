package com.firstExample.sping_example.service;

import com.firstExample.sping_example.model.IdCard;
import com.firstExample.sping_example.model.Student;
import com.firstExample.sping_example.respositires.IdCardRepositry;
import com.firstExample.sping_example.respositires.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private IdCardRepositry idCardRepositry;

   

    public List<Student> getStudnetAgePlus10() {
        List<Student> students = new ArrayList<>();
        List<IdCard> idCards = idCardRepositry.findAll();

        for (IdCard x : idCards) {
            Student student = new Student();
            student.setAge(x.getStudent().getAge() + 10);
            student.setName(x.getStudent().getName());
            student.setId(x.getStudent().getId());
            students.add(student);

        }
        return students;

    }

    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){

        return studentRepository.save(student);
    }
}
