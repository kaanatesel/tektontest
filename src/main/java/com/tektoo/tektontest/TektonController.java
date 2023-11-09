package com.tektoo.tektontest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TektonController {

    private final TektonService tektonService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return tektonService.helloBrom(name);
    }

    @GetMapping("/imAmTekton")
    public String imAmTekton(){
        return "My name is tekton";
    }
}
