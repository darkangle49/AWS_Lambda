package com.example.awslamda.AWS_Lambda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @GetMapping
    public String demo()
    {
        return "Hello from lambda";
    }
}
