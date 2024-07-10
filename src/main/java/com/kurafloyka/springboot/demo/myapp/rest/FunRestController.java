package com.kurafloyka.springboot.demo.myapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

@Value("${my.name}")
    private String name;
@Value("${my.surname}")
    private String surname;


    //expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!" + " name : "+this.name + " surname : " + surname;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k! Please";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
