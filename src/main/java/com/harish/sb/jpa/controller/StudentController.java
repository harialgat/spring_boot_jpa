package com.harish.sb.jpa.controller;

import com.harish.sb.jpa.dao.StudentDaoImpl;
import com.harish.sb.jpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentDaoImpl studentDao;

    @PostMapping("/add/student")
    public ResponseEntity addStudent(@RequestBody Student student) throws Exception {
        try {
            studentDao.addStudent(student);
            return new ResponseEntity(HttpStatusCode.valueOf(201));
        }catch (Exception e){
             throw new Exception("data was not added");
        }

    }
}
