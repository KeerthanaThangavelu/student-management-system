package com.example.sms.service;

import com.example.sms.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {


    @Autowired
    StudentService studentService;

    @Test
    void addStudentIncreasesSize() {
        int sizeBefore = studentService.getAllStudents().size();
        studentService.addStudent(new Student("John Doe", "john@example.com", 20));
        assertEquals(sizeBefore + 1, studentService.getAllStudents().size());
    }

}