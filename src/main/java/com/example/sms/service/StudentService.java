package com.example.sms.service;

import com.example.sms.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    List<Student> studentList;


    public List<Student> getAllStudents() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudent(int id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }

    public Optional<Student> getStudentById(int id) {
        return studentList.stream().filter(s -> s.getId().equals(id)).findFirst();
    }
}
