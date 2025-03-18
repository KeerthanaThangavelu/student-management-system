package com.example.sms.config;

import com.example.sms.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {


    @Bean
    public List<Student> studentList() {
        return new ArrayList<>();
    }
}
