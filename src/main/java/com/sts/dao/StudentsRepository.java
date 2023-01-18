package com.sts.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.entities.Student;

@Repository
public interface StudentsRepository extends CrudRepository<Student, Integer>{

}
