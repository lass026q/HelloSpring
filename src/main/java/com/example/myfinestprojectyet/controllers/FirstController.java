package com.example.myfinestprojectyet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@RestController
public class FirstController
{


    @GetMapping("/endpoint")
    public String endpoint() {
        return "Hello Spring";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input){
        return "Du skrev dette: " + input;
    }


    @GetMapping("/erdetfredag")
    public String erDetFredag(){
        String yesOrNo = "";
        Date date = new Date();
        if (date.getDay() == 5) {
            yesOrNo = "YES!";
        } else yesOrNo = "no";

        return yesOrNo;

    }

    }


