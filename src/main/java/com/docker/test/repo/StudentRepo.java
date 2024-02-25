package com.docker.test.repo;

import com.docker.test.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {
}
