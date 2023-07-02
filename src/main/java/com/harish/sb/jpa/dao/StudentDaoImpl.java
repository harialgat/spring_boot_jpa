package com.harish.sb.jpa.dao;

import com.harish.sb.jpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void addStudent(Student student) {
        this.studentRepository.save(student);

    }

    @Override
    public void removeStudent(int id) {
     studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(int id, Object field) {

    }
}
