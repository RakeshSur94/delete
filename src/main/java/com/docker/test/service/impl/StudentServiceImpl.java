package com.docker.test.service.impl;

import com.docker.test.entity.StudentEntity;
import com.docker.test.repo.StudentRepo;
import com.docker.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public StudentEntity save(StudentEntity student) {


        return this.studentRepo.save(student);
    }
}
