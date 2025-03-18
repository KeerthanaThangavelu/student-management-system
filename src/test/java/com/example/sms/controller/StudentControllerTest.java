package com.example.sms.controller;

import com.example.sms.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class StudentControllerTest {

    @Autowired private MockMvc mockMvc;
    @Autowired
    private StudentService studentService;

    @Test
    void testGetStudentsReturns200() throws Exception {
        mockMvc.perform(get("/students")).andExpect(status().isOk());
    }

}