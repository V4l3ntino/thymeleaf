package com.thymeleaf.libros.model.service.impl;

import com.thymeleaf.libros.model.entity.Student;
import com.thymeleaf.libros.model.repository.StudentRepository;
import com.thymeleaf.libros.model.service.Implementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements Implementations<Student> {

    @Autowired
    StudentRepository objdb;
    @Override
    public void createMethod(Student obj) {
        objdb.save(obj);
    }

    @Override
    public void deleteMethod(Integer id) {
        objdb.deleteById(id);
    }

    @Override
    public Student getMethod(Integer id) {
        return objdb.findById(id).get();
    }

    @Override
    public List<Student> getAllMethod() {
        return objdb.findAll();
    }
}
