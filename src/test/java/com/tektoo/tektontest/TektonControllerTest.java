package com.tektoo.tektontest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@WebMvcTest(controllers = TektonController.class)
public class TektonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    TektonService tektonService;

    @Test
    void testTekton()  throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.
                        get("/imAmTekton")).andReturn();

        assertThat(result.getResponse().getContentAsString()).isEqualTo("My name is tekton");
    }
}
