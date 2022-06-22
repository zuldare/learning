package jj.hernandez.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtheleteController {

    @GetMapping(path = "/athletes")
    public void getAthletes() {
        System.out.println("hola");
    }
}
