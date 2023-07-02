package com.harish.sb.jpa.dao;

import com.harish.sb.jpa.entity.Student;

public interface StudentDao {
    public Student getStudent(int id);

    public void addStudent(Student student);

    public void removeStudent(int id);

    public void updateStudent(int id, Object field);
}
