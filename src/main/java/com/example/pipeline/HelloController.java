package com.example.pipeline;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam(defaultValue = "Jenkins") String name, Model model) {
        model.addAttribute("name", name);
        return "Hello";
    }

    @GetMapping("/test-pipeline")
    public String test() {
        return "Test-pipeline";
    }
}
