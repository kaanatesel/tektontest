package com.tektoo.tektontest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TektonServiceIT {

    private TektonService tektonService;
    @BeforeEach
    void setUp(){
        tektonService =  new TektonService();
    }
    @Test
    @DisplayName("tekton_service_test")
    public void tekton_service_test() {
        String response = tektonService.helloBrom("kaan");
        assertThat(response).isEqualTo("Hello kaan");
    }
}
