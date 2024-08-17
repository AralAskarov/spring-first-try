package com.aral.springstudents.controller;

import com.aral.springstudents.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aral.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }

    @PostMapping("savestud")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Ты крутой";
    }
    // api/v1/students/aral@gmail.com
    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("updatestud")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_Stud/{email}")
    public  void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}

// во всех методах RestController есть скытая аннотация responceBody
//она сериализует ответ в жсон
//а RequestBody сериализует запрашиваемый объект для работы с ним