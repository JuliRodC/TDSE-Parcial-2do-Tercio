package com.tdse.mathservice;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MathController {

    @GetMapping("/Tribonacci")
    public Map<String, Object> Tribonacci(@RequestParam int value)
}
