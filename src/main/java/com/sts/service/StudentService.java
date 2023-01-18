package com.sts.service;

import com.sts.entities.Student;

public interface StudentService {
    Student getStudentById(Integer studentId);
    Student addStudent(Student student);

}
