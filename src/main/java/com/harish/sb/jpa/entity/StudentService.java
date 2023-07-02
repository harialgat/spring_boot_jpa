package com.harish.sb.jpa.entity;

import com.harish.sb.jpa.dao.StudentDaoImpl;
import com.harish.sb.jpa.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDaoImpl studentDao;

    @Autowired
    private StudentRepository studentRepository;

    private List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Iterable<Student> studentIterator = studentRepository.findAll();
        studentIterator.iterator();
        while (studentIterator.iterator().hasNext()) {
            students.add(studentIterator.iterator().next());
        }
        return students;
    }
}
