package com.aral.springstudents.Service.impl;

import com.aral.springstudents.Service.StudentService;
import com.aral.springstudents.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.aral.springstudents.repository.InMemoryStudentDAO;


import java.util.List;

@Service
@AllArgsConstructor
public class inMemoryStudentService implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
