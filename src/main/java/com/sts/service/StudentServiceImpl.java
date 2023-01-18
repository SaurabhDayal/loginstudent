package com.sts.service;

import com.sts.dao.StudentsRepository;
import com.sts.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentsRepository studentsRepository;
    public StudentServiceImpl(){}
    public StudentServiceImpl(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentsRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student addStudent(Student student) {
        studentsRepository.save(student);
        return student;
    }
}
