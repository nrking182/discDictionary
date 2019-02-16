package com.uglyOrgan.jsonToDB;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uglyOrgan.jsonToDB.controller.DiscController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DiscController.class)
public class DiscControllerMockMvcTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void getDiscs(){
        mockMvc.perform(get())
    }

}
