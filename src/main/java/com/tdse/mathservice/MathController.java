package com.tdse.mathservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MathController {

    @GetMapping("/Tribonacci")
    public String Tribonacci(@RequestParam int value){
        long a = 0, b = 0, c = 1;
        String result = "0,0,1";
        for (int i = 3; i <= value; i++){
            long next = a+b+c;
            result += next;
            a = b; b = c; c = next;
        }
        return result;
    }
}
