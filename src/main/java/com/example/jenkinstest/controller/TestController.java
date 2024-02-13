package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class: TestController.
 *
 * @author nhn
 * @version 2024/02/13
 */

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
