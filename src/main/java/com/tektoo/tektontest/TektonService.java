package com.tektoo.tektontest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TektonService {
        public String helloBrom(String name){
            return "Hello " + name;
        }
}
