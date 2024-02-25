package com.docker.test.api;

import com.docker.test.entity.StudentEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentApi {

    @GetMapping
    public String test(){
        return "it test ok";
    }
    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity student){
        return this.saveStudent(student);
    }
}

