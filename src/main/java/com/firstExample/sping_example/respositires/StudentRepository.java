package com.firstExample.sping_example.respositires;

import com.firstExample.sping_example.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Integer> {
    List<Student> findAll();
}
